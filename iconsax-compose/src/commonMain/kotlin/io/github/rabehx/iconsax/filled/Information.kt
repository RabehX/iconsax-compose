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


val Iconsax.Filled.Information: ImageVector
    get() {
        if (_Information != null) {
            return _Information!!
        }
        _Information = ImageVector.Builder(
            name = "Filled.Information",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.561f, 10.738f)
                lineTo(20.211f, 9.158f)
                curveTo(19.961f, 8.858f, 19.751f, 8.298f, 19.751f, 7.898f)
                verticalLineTo(6.198f)
                curveTo(19.751f, 5.138f, 18.881f, 4.268f, 17.821f, 4.268f)
                horizontalLineTo(16.121f)
                curveTo(15.721f, 4.268f, 15.151f, 4.058f, 14.851f, 3.808f)
                lineTo(13.271f, 2.458f)
                curveTo(12.581f, 1.868f, 11.451f, 1.868f, 10.761f, 2.458f)
                lineTo(9.161f, 3.808f)
                curveTo(8.861f, 4.058f, 8.301f, 4.268f, 7.901f, 4.268f)
                horizontalLineTo(6.171f)
                curveTo(5.111f, 4.268f, 4.241f, 5.138f, 4.241f, 6.198f)
                verticalLineTo(7.898f)
                curveTo(4.241f, 8.288f, 4.041f, 8.848f, 3.791f, 9.148f)
                lineTo(2.441f, 10.738f)
                curveTo(1.861f, 11.438f, 1.861f, 12.558f, 2.441f, 13.238f)
                lineTo(3.791f, 14.828f)
                curveTo(4.041f, 15.118f, 4.241f, 15.688f, 4.241f, 16.078f)
                verticalLineTo(17.788f)
                curveTo(4.241f, 18.848f, 5.111f, 19.718f, 6.171f, 19.718f)
                horizontalLineTo(7.911f)
                curveTo(8.301f, 19.718f, 8.871f, 19.928f, 9.171f, 20.178f)
                lineTo(10.751f, 21.528f)
                curveTo(11.441f, 22.118f, 12.571f, 22.118f, 13.261f, 21.528f)
                lineTo(14.841f, 20.178f)
                curveTo(15.141f, 19.928f, 15.701f, 19.718f, 16.101f, 19.718f)
                horizontalLineTo(17.801f)
                curveTo(18.861f, 19.718f, 19.731f, 18.848f, 19.731f, 17.788f)
                verticalLineTo(16.088f)
                curveTo(19.731f, 15.688f, 19.941f, 15.128f, 20.191f, 14.828f)
                lineTo(21.541f, 13.248f)
                curveTo(22.151f, 12.568f, 22.151f, 11.438f, 21.561f, 10.738f)
                close()
                moveTo(11.251f, 8.128f)
                curveTo(11.251f, 7.718f, 11.591f, 7.378f, 12.001f, 7.378f)
                curveTo(12.411f, 7.378f, 12.751f, 7.718f, 12.751f, 8.128f)
                verticalLineTo(12.958f)
                curveTo(12.751f, 13.368f, 12.411f, 13.708f, 12.001f, 13.708f)
                curveTo(11.591f, 13.708f, 11.251f, 13.368f, 11.251f, 12.958f)
                verticalLineTo(8.128f)
                close()
                moveTo(12.001f, 16.868f)
                curveTo(11.451f, 16.868f, 11.001f, 16.418f, 11.001f, 15.868f)
                curveTo(11.001f, 15.318f, 11.441f, 14.868f, 12.001f, 14.868f)
                curveTo(12.551f, 14.868f, 13.001f, 15.318f, 13.001f, 15.868f)
                curveTo(13.001f, 16.418f, 12.561f, 16.868f, 12.001f, 16.868f)
                close()
            }
        }.build()

        return _Information!!
    }

@Suppress("ObjectPropertyName")
private var _Information: ImageVector? = null
