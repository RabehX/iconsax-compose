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


val Iconsax.Filled.Login1: ImageVector
    get() {
        if (_Login1 != null) {
            return _Login1!!
        }
        _Login1 = ImageVector.Builder(
            name = "Filled.Login1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.8f, 2f)
                horizontalLineTo(14.2f)
                curveTo(11f, 2f, 9f, 4f, 9f, 7.2f)
                verticalLineTo(11.25f)
                horizontalLineTo(13.44f)
                lineTo(11.37f, 9.18f)
                curveTo(11.22f, 9.03f, 11.15f, 8.84f, 11.15f, 8.65f)
                curveTo(11.15f, 8.46f, 11.22f, 8.27f, 11.37f, 8.12f)
                curveTo(11.66f, 7.83f, 12.14f, 7.83f, 12.43f, 8.12f)
                lineTo(15.78f, 11.47f)
                curveTo(16.07f, 11.76f, 16.07f, 12.24f, 15.78f, 12.53f)
                lineTo(12.43f, 15.88f)
                curveTo(12.14f, 16.17f, 11.66f, 16.17f, 11.37f, 15.88f)
                curveTo(11.08f, 15.59f, 11.08f, 15.11f, 11.37f, 14.82f)
                lineTo(13.44f, 12.75f)
                horizontalLineTo(9f)
                verticalLineTo(16.8f)
                curveTo(9f, 20f, 11f, 22f, 14.2f, 22f)
                horizontalLineTo(16.79f)
                curveTo(19.99f, 22f, 21.99f, 20f, 21.99f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(22f, 4f, 20f, 2f, 16.8f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.75f, 11.25f)
                curveTo(2.34f, 11.25f, 2f, 11.59f, 2f, 12f)
                curveTo(2f, 12.41f, 2.34f, 12.75f, 2.75f, 12.75f)
                horizontalLineTo(9f)
                verticalLineTo(11.25f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()

        return _Login1!!
    }

@Suppress("ObjectPropertyName")
private var _Login1: ImageVector? = null
