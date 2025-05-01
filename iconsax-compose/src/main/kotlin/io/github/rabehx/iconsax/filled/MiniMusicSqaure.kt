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


val Iconsax.Filled.MiniMusicSqaure: ImageVector
    get() {
        if (_MiniMusicSqaure != null) {
            return _MiniMusicSqaure!!
        }
        _MiniMusicSqaure = ImageVector.Builder(
            name = "Filled.MiniMusicSqaure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f
            ) {
                moveTo(20.712f, 17.52f)
                curveTo(20.342f, 18.74f, 19.612f, 19.68f, 18.572f, 20.26f)
                curveTo(18.532f, 20.1f, 18.512f, 19.93f, 18.512f, 19.76f)
                curveTo(18.512f, 18.539f, 19.502f, 17.539f, 20.712f, 17.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 7.52f)
                verticalLineTo(9.484f)
                curveTo(21f, 10.007f, 20.586f, 10.429f, 20.08f, 10.56f)
                lineTo(17.13f, 11.38f)
                curveTo(15.57f, 11.78f, 14.53f, 13.13f, 14.53f, 14.74f)
                verticalLineTo(16.285f)
                curveTo(14.53f, 16.76f, 14.187f, 17.156f, 13.761f, 17.364f)
                curveTo(12.746f, 17.862f, 11.97f, 18.871f, 11.677f, 20.011f)
                curveTo(11.54f, 20.546f, 11.102f, 21f, 10.55f, 21f)
                horizontalLineTo(7.52f)
                curveTo(4.07f, 21f, 2f, 18.94f, 2f, 15.48f)
                verticalLineTo(7.52f)
                curveTo(2f, 4.06f, 4.07f, 2f, 7.52f, 2f)
                horizontalLineTo(15.48f)
                curveTo(18.93f, 2f, 21f, 4.06f, 21f, 7.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.309f, 12.251f)
                curveTo(22.049f, 12.061f, 21.629f, 11.861f, 20.999f, 11.921f)
                curveTo(20.839f, 11.931f, 20.669f, 11.961f, 20.479f, 12.011f)
                lineTo(17.499f, 12.831f)
                curveTo(16.609f, 13.061f, 16.029f, 13.811f, 16.029f, 14.741f)
                verticalLineTo(18.651f)
                curveTo(15.799f, 18.571f, 15.549f, 18.521f, 15.289f, 18.521f)
                curveTo(14.049f, 18.521f, 13.039f, 19.521f, 13.039f, 20.761f)
                curveTo(13.039f, 20.841f, 13.039f, 20.921f, 13.049f, 21.001f)
                curveTo(13.169f, 22.121f, 14.129f, 23.001f, 15.289f, 23.001f)
                curveTo(16.509f, 23.001f, 17.499f, 22.011f, 17.519f, 20.801f)
                curveTo(17.519f, 20.781f, 17.529f, 20.771f, 17.529f, 20.761f)
                verticalLineTo(17.071f)
                lineTo(20.979f, 16.121f)
                lineTo(21.499f, 15.981f)
                verticalLineTo(17.661f)
                curveTo(21.269f, 17.581f, 21.019f, 17.521f, 20.749f, 17.521f)
                horizontalLineTo(20.709f)
                curveTo(19.499f, 17.541f, 18.509f, 18.541f, 18.509f, 19.761f)
                curveTo(18.509f, 19.931f, 18.529f, 20.101f, 18.569f, 20.261f)
                curveTo(18.799f, 21.261f, 19.689f, 22.011f, 20.749f, 22.011f)
                curveTo(21.979f, 22.011f, 22.969f, 21.021f, 22.989f, 19.801f)
                curveTo(22.989f, 19.791f, 22.999f, 19.781f, 22.999f, 19.761f)
                verticalLineTo(13.931f)
                curveTo(22.999f, 13.171f, 22.769f, 12.611f, 22.309f, 12.251f)
                close()
                moveTo(15.289f, 21.501f)
                curveTo(14.959f, 21.501f, 14.679f, 21.291f, 14.589f, 21.001f)
                curveTo(14.549f, 20.931f, 14.539f, 20.841f, 14.539f, 20.761f)
                curveTo(14.539f, 20.351f, 14.879f, 20.021f, 15.289f, 20.021f)
                curveTo(15.689f, 20.021f, 16.029f, 20.351f, 16.029f, 20.761f)
                curveTo(16.029f, 20.841f, 16.019f, 20.911f, 15.989f, 20.981f)
                curveTo(15.899f, 21.281f, 15.619f, 21.501f, 15.289f, 21.501f)
                close()
                moveTo(20.749f, 20.511f)
                curveTo(20.349f, 20.511f, 20.009f, 20.171f, 20.009f, 19.761f)
                curveTo(20.009f, 19.361f, 20.349f, 19.021f, 20.749f, 19.021f)
                curveTo(21.159f, 19.021f, 21.499f, 19.361f, 21.499f, 19.761f)
                curveTo(21.499f, 20.171f, 21.159f, 20.511f, 20.749f, 20.511f)
                close()
            }
        }.build()

        return _MiniMusicSqaure!!
    }

@Suppress("ObjectPropertyName")
private var _MiniMusicSqaure: ImageVector? = null
