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


val Iconsax.Filled.PlayAdd: ImageVector
    get() {
        if (_PlayAdd != null) {
            return _PlayAdd!!
        }
        _PlayAdd = ImageVector.Builder(
            name = "Filled.PlayAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.851f, 10.251f)
                curveTo(21.071f, 5.801f, 17.241f, 2.351f, 12.731f, 2.031f)
                curveTo(6.631f, 1.591f, 1.591f, 6.641f, 2.031f, 12.731f)
                curveTo(2.351f, 17.241f, 5.801f, 21.061f, 10.251f, 21.841f)
                curveTo(11.401f, 22.041f, 12.521f, 22.041f, 13.591f, 21.861f)
                curveTo(13.901f, 21.811f, 14.081f, 21.471f, 13.961f, 21.191f)
                curveTo(13.661f, 20.511f, 13.501f, 19.761f, 13.501f, 18.991f)
                curveTo(13.501f, 17.301f, 14.251f, 15.741f, 15.571f, 14.701f)
                curveTo(16.541f, 13.921f, 17.761f, 13.491f, 19.001f, 13.491f)
                curveTo(19.781f, 13.491f, 20.521f, 13.651f, 21.191f, 13.951f)
                curveTo(21.481f, 14.081f, 21.811f, 13.891f, 21.871f, 13.581f)
                curveTo(22.051f, 12.521f, 22.051f, 11.401f, 21.851f, 10.251f)
                close()
                moveTo(14.501f, 13.571f)
                lineTo(13.301f, 14.261f)
                lineTo(12.101f, 14.951f)
                curveTo(10.611f, 15.811f, 9.391f, 15.111f, 9.391f, 13.381f)
                verticalLineTo(12.001f)
                verticalLineTo(10.611f)
                curveTo(9.391f, 8.891f, 10.611f, 8.181f, 12.101f, 9.041f)
                lineTo(13.301f, 9.731f)
                lineTo(14.501f, 10.421f)
                curveTo(15.991f, 11.301f, 15.991f, 12.701f, 14.501f, 13.571f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 15f)
                curveTo(18.06f, 15f, 17.19f, 15.33f, 16.5f, 15.88f)
                curveTo(15.58f, 16.61f, 15f, 17.74f, 15f, 19f)
                curveTo(15f, 19.75f, 15.21f, 20.46f, 15.58f, 21.06f)
                curveTo(16.27f, 22.22f, 17.54f, 23f, 19f, 23f)
                curveTo(20.01f, 23f, 20.93f, 22.63f, 21.63f, 22f)
                curveTo(21.94f, 21.74f, 22.21f, 21.42f, 22.42f, 21.06f)
                curveTo(22.79f, 20.46f, 23f, 19.75f, 23f, 19f)
                curveTo(23f, 16.79f, 21.21f, 15f, 19f, 15f)
                close()
                moveTo(20.5f, 19.73f)
                horizontalLineTo(19.75f)
                verticalLineTo(20.51f)
                curveTo(19.75f, 20.92f, 19.41f, 21.26f, 19f, 21.26f)
                curveTo(18.59f, 21.26f, 18.25f, 20.92f, 18.25f, 20.51f)
                verticalLineTo(19.73f)
                horizontalLineTo(17.5f)
                curveTo(17.09f, 19.73f, 16.75f, 19.39f, 16.75f, 18.98f)
                curveTo(16.75f, 18.57f, 17.09f, 18.23f, 17.5f, 18.23f)
                horizontalLineTo(18.25f)
                verticalLineTo(17.52f)
                curveTo(18.25f, 17.11f, 18.59f, 16.77f, 19f, 16.77f)
                curveTo(19.41f, 16.77f, 19.75f, 17.11f, 19.75f, 17.52f)
                verticalLineTo(18.23f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 18.23f, 21.25f, 18.57f, 21.25f, 18.98f)
                curveTo(21.25f, 19.39f, 20.91f, 19.73f, 20.5f, 19.73f)
                close()
            }
        }.build()

        return _PlayAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PlayAdd: ImageVector? = null
