/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.LanguageCircle: ImageVector
    get() {
        if (_LanguageCircle != null) {
            return _LanguageCircle!!
        }
        _LanguageCircle = ImageVector.Builder(
            name = "Filled.LanguageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(17f, 17.47f)
                curveTo(15.29f, 17.47f, 13.69f, 16.73f, 12.41f, 15.36f)
                curveTo(10.96f, 16.67f, 9.07f, 17.47f, 7f, 17.47f)
                curveTo(6.59f, 17.47f, 6.25f, 17.13f, 6.25f, 16.72f)
                curveTo(6.25f, 16.31f, 6.59f, 15.97f, 7f, 15.97f)
                curveTo(10.47f, 15.97f, 13.34f, 13.22f, 13.71f, 9.7f)
                horizontalLineTo(12f)
                horizontalLineTo(7.01f)
                curveTo(6.6f, 9.7f, 6.26f, 9.36f, 6.26f, 8.95f)
                curveTo(6.26f, 8.54f, 6.6f, 8.21f, 7.01f, 8.21f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.28f)
                curveTo(11.25f, 6.87f, 11.59f, 6.53f, 12f, 6.53f)
                curveTo(12.41f, 6.53f, 12.75f, 6.87f, 12.75f, 7.28f)
                verticalLineTo(8.21f)
                horizontalLineTo(14.44f)
                curveTo(14.46f, 8.21f, 14.48f, 8.2f, 14.5f, 8.2f)
                curveTo(14.52f, 8.2f, 14.54f, 8.21f, 14.56f, 8.21f)
                horizontalLineTo(16.99f)
                curveTo(17.4f, 8.21f, 17.74f, 8.55f, 17.74f, 8.96f)
                curveTo(17.74f, 9.37f, 17.4f, 9.71f, 16.99f, 9.71f)
                horizontalLineTo(15.21f)
                curveTo(15.06f, 11.42f, 14.42f, 12.99f, 13.44f, 14.27f)
                curveTo(14.44f, 15.38f, 15.69f, 15.98f, 17f, 15.98f)
                curveTo(17.41f, 15.98f, 17.75f, 16.32f, 17.75f, 16.73f)
                curveTo(17.75f, 17.14f, 17.41f, 17.47f, 17f, 17.47f)
                close()
            }
        }.build()

        return _LanguageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageCircle: ImageVector? = null
