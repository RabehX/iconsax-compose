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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Logout: ImageVector
    get() {
        if (_Logout != null) {
            return _Logout!!
        }
        _Logout = ImageVector.Builder(
            name = "Outline.Logout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.241f, 22.27f)
                horizontalLineTo(15.111f)
                curveTo(10.67f, 22.27f, 8.531f, 20.52f, 8.16f, 16.6f)
                curveTo(8.12f, 16.19f, 8.42f, 15.82f, 8.84f, 15.78f)
                curveTo(9.241f, 15.74f, 9.62f, 16.05f, 9.66f, 16.46f)
                curveTo(9.95f, 19.6f, 11.431f, 20.77f, 15.12f, 20.77f)
                horizontalLineTo(15.25f)
                curveTo(19.32f, 20.77f, 20.76f, 19.33f, 20.76f, 15.26f)
                verticalLineTo(8.74f)
                curveTo(20.76f, 4.67f, 19.32f, 3.23f, 15.25f, 3.23f)
                horizontalLineTo(15.12f)
                curveTo(11.41f, 3.23f, 9.931f, 4.42f, 9.66f, 7.62f)
                curveTo(9.611f, 8.03f, 9.26f, 8.34f, 8.84f, 8.3f)
                curveTo(8.42f, 8.27f, 8.12f, 7.9f, 8.151f, 7.49f)
                curveTo(8.491f, 3.51f, 10.641f, 1.73f, 15.111f, 1.73f)
                horizontalLineTo(15.241f)
                curveTo(20.15f, 1.73f, 22.25f, 3.83f, 22.25f, 8.74f)
                verticalLineTo(15.26f)
                curveTo(22.25f, 20.17f, 20.15f, 22.27f, 15.241f, 22.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.999f, 12.75f)
                horizontalLineTo(3.619f)
                curveTo(3.209f, 12.75f, 2.869f, 12.41f, 2.869f, 12f)
                curveTo(2.869f, 11.59f, 3.209f, 11.25f, 3.619f, 11.25f)
                horizontalLineTo(14.999f)
                curveTo(15.409f, 11.25f, 15.749f, 11.59f, 15.749f, 12f)
                curveTo(15.749f, 12.41f, 15.409f, 12.75f, 14.999f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.849f, 16.1f)
                curveTo(5.659f, 16.1f, 5.469f, 16.03f, 5.319f, 15.88f)
                lineTo(1.969f, 12.53f)
                curveTo(1.679f, 12.24f, 1.679f, 11.76f, 1.969f, 11.47f)
                lineTo(5.319f, 8.12f)
                curveTo(5.609f, 7.83f, 6.089f, 7.83f, 6.379f, 8.12f)
                curveTo(6.669f, 8.41f, 6.669f, 8.89f, 6.379f, 9.18f)
                lineTo(3.559f, 12f)
                lineTo(6.379f, 14.82f)
                curveTo(6.669f, 15.11f, 6.669f, 15.59f, 6.379f, 15.88f)
                curveTo(6.239f, 16.03f, 6.039f, 16.1f, 5.849f, 16.1f)
                close()
            }
        }.build()

        return _Logout!!
    }

@Suppress("ObjectPropertyName")
private var _Logout: ImageVector? = null
