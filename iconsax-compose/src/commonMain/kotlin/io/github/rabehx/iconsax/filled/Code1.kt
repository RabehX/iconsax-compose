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


val Iconsax.Filled.Code1: ImageVector
    get() {
        if (_Code1 != null) {
            return _Code1!!
        }
        _Code1 = ImageVector.Builder(
            name = "Filled.Code1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(9.94f, 13.27f)
                curveTo(9.26f, 14.29f, 8.32f, 15.12f, 7.22f, 15.67f)
                curveTo(7.12f, 15.72f, 7f, 15.75f, 6.89f, 15.75f)
                curveTo(6.61f, 15.75f, 6.35f, 15.6f, 6.22f, 15.34f)
                curveTo(6.03f, 14.97f, 6.18f, 14.52f, 6.56f, 14.33f)
                curveTo(7.43f, 13.9f, 8.17f, 13.24f, 8.7f, 12.44f)
                curveTo(8.88f, 12.17f, 8.88f, 11.83f, 8.7f, 11.56f)
                curveTo(8.16f, 10.76f, 7.42f, 10.1f, 6.56f, 9.67f)
                curveTo(6.18f, 9.49f, 6.03f, 9.04f, 6.22f, 8.66f)
                curveTo(6.4f, 8.29f, 6.85f, 8.14f, 7.22f, 8.33f)
                curveTo(8.32f, 8.88f, 9.26f, 9.71f, 9.94f, 10.73f)
                curveTo(10.46f, 11.5f, 10.46f, 12.5f, 9.94f, 13.27f)
                close()
                moveTo(17f, 15.75f)
                horizontalLineTo(13f)
                curveTo(12.59f, 15.75f, 12.25f, 15.41f, 12.25f, 15f)
                curveTo(12.25f, 14.59f, 12.59f, 14.25f, 13f, 14.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 14.25f, 17.75f, 14.59f, 17.75f, 15f)
                curveTo(17.75f, 15.41f, 17.41f, 15.75f, 17f, 15.75f)
                close()
            }
        }.build()

        return _Code1!!
    }

@Suppress("ObjectPropertyName")
private var _Code1: ImageVector? = null
