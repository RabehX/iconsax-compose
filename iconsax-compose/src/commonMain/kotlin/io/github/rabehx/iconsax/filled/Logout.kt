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


val Iconsax.Filled.Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Filled.Logout",
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
                horizontalLineTo(15.25f)
                curveTo(15.66f, 11.25f, 16f, 11.59f, 16f, 12f)
                curveTo(16f, 12.41f, 15.66f, 12.75f, 15.25f, 12.75f)
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
                moveTo(4.561f, 11.25f)
                lineTo(6.631f, 9.18f)
                curveTo(6.781f, 9.03f, 6.851f, 8.84f, 6.851f, 8.65f)
                curveTo(6.851f, 8.46f, 6.781f, 8.26f, 6.631f, 8.12f)
                curveTo(6.341f, 7.83f, 5.861f, 7.83f, 5.571f, 8.12f)
                lineTo(2.221f, 11.47f)
                curveTo(1.931f, 11.76f, 1.931f, 12.24f, 2.221f, 12.53f)
                lineTo(5.571f, 15.88f)
                curveTo(5.861f, 16.17f, 6.341f, 16.17f, 6.631f, 15.88f)
                curveTo(6.921f, 15.59f, 6.921f, 15.11f, 6.631f, 14.82f)
                lineTo(4.561f, 12.75f)
                horizontalLineTo(9.001f)
                verticalLineTo(11.25f)
                horizontalLineTo(4.561f)
                close()
            }
        }.build()

        return _Logout!!
    }

@Suppress("ObjectPropertyName")
private var _Logout: ImageVector? = null
