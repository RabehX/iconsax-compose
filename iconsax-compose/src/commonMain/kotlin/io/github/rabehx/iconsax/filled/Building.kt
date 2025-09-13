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


val Iconsax.Filled.Building: ImageVector
    get() {
        if (_Building != null) {
            return _Building!!
        }
        _Building = ImageVector.Builder(
            name = "Filled.Building",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.751f, 4.64f)
                lineTo(6.321f, 2.45f)
                curveTo(3.931f, 1.28f, 1.971f, 2.47f, 1.971f, 5.09f)
                verticalLineTo(19.93f)
                curveTo(1.971f, 21.07f, 2.921f, 22f, 4.081f, 22f)
                horizontalLineTo(11.501f)
                curveTo(12.051f, 22f, 12.501f, 21.55f, 12.501f, 21f)
                verticalLineTo(7.41f)
                curveTo(12.501f, 6.36f, 11.711f, 5.11f, 10.751f, 4.64f)
                close()
                moveTo(8.971f, 13.75f)
                horizontalLineTo(5.501f)
                curveTo(5.091f, 13.75f, 4.751f, 13.41f, 4.751f, 13f)
                curveTo(4.751f, 12.59f, 5.091f, 12.25f, 5.501f, 12.25f)
                horizontalLineTo(8.971f)
                curveTo(9.381f, 12.25f, 9.721f, 12.59f, 9.721f, 13f)
                curveTo(9.721f, 13.41f, 9.391f, 13.75f, 8.971f, 13.75f)
                close()
                moveTo(8.971f, 9.75f)
                horizontalLineTo(5.501f)
                curveTo(5.091f, 9.75f, 4.751f, 9.41f, 4.751f, 9f)
                curveTo(4.751f, 8.59f, 5.091f, 8.25f, 5.501f, 8.25f)
                horizontalLineTo(8.971f)
                curveTo(9.381f, 8.25f, 9.721f, 8.59f, 9.721f, 9f)
                curveTo(9.721f, 9.41f, 9.391f, 9.75f, 8.971f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 18.039f)
                verticalLineTo(19.499f)
                curveTo(22f, 20.879f, 20.88f, 21.999f, 19.5f, 21.999f)
                horizontalLineTo(14.97f)
                curveTo(14.43f, 21.999f, 14f, 21.569f, 14f, 21.029f)
                verticalLineTo(18.869f)
                curveTo(15.07f, 18.999f, 16.2f, 18.689f, 17.01f, 18.039f)
                curveTo(17.69f, 18.589f, 18.56f, 18.919f, 19.51f, 18.919f)
                curveTo(20.44f, 18.919f, 21.31f, 18.589f, 22f, 18.039f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 15.05f)
                verticalLineTo(15.061f)
                curveTo(21.92f, 16.371f, 20.85f, 17.42f, 19.51f, 17.42f)
                curveTo(18.12f, 17.42f, 17.01f, 16.291f, 17.01f, 14.92f)
                curveTo(17.01f, 16.451f, 15.6f, 17.681f, 14f, 17.371f)
                verticalLineTo(12f)
                curveTo(14f, 11.361f, 14.59f, 10.88f, 15.22f, 11.021f)
                lineTo(17.01f, 11.42f)
                lineTo(17.49f, 11.531f)
                lineTo(19.53f, 11.991f)
                curveTo(20.02f, 12.09f, 20.47f, 12.26f, 20.86f, 12.51f)
                curveTo(20.86f, 12.521f, 20.87f, 12.521f, 20.87f, 12.521f)
                curveTo(20.97f, 12.59f, 21.07f, 12.67f, 21.16f, 12.76f)
                curveTo(21.62f, 13.22f, 21.92f, 13.891f, 21.99f, 14.87f)
                curveTo(21.99f, 14.931f, 22f, 14.991f, 22f, 15.05f)
                close()
            }
        }.build()

        return _Building!!
    }

@Suppress("ObjectPropertyName")
private var _Building: ImageVector? = null
