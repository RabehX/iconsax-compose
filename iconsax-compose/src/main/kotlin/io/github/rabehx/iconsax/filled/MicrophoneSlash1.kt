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


val Iconsax.Filled.MicrophoneSlash1: ImageVector
    get() {
        if (_MicrophoneSlash1 != null) {
            return _MicrophoneSlash1!!
        }
        _MicrophoneSlash1 = ImageVector.Builder(
            name = "Filled.MicrophoneSlash1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.619f, 5.72f)
                lineTo(7.009f, 16.33f)
                curveTo(6.279f, 15.34f, 5.879f, 14.13f, 5.879f, 12.82f)
                verticalLineTo(8.11f)
                curveTo(5.879f, 6.27f, 6.699f, 4.62f, 7.999f, 3.5f)
                verticalLineTo(7.64f)
                curveTo(7.999f, 8.03f, 8.319f, 8.35f, 8.699f, 8.35f)
                curveTo(9.089f, 8.35f, 9.409f, 8.03f, 9.409f, 7.64f)
                verticalLineTo(2.57f)
                curveTo(9.869f, 2.34f, 10.359f, 2.18f, 10.869f, 2.09f)
                verticalLineTo(5.75f)
                curveTo(10.869f, 6.15f, 11.189f, 6.46f, 11.579f, 6.46f)
                curveTo(11.969f, 6.46f, 12.289f, 6.15f, 12.289f, 5.75f)
                verticalLineTo(2f)
                curveTo(14.679f, 2.11f, 16.739f, 3.61f, 17.619f, 5.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.12f, 8.879f)
                verticalLineTo(12.819f)
                curveTo(18.12f, 16.189f, 15.37f, 18.939f, 12f, 18.939f)
                curveTo(11.82f, 18.939f, 11.64f, 18.929f, 11.46f, 18.909f)
                curveTo(11.38f, 18.909f, 11.3f, 18.899f, 11.23f, 18.889f)
                curveTo(11.1f, 18.869f, 10.97f, 18.849f, 10.85f, 18.829f)
                curveTo(10.8f, 18.829f, 10.76f, 18.809f, 10.7f, 18.799f)
                curveTo(10.56f, 18.769f, 10.42f, 18.729f, 10.29f, 18.689f)
                curveTo(10.07f, 18.629f, 9.86f, 18.549f, 9.66f, 18.469f)
                curveTo(9.53f, 18.419f, 9.41f, 18.369f, 9.29f, 18.299f)
                curveTo(9.26f, 18.289f, 9.24f, 18.269f, 9.21f, 18.259f)
                curveTo(9.11f, 18.209f, 9.01f, 18.159f, 8.91f, 18.089f)
                lineTo(18.12f, 8.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.75f, 11f)
                verticalLineTo(13f)
                curveTo(21.75f, 18.38f, 17.38f, 22.75f, 12f, 22.75f)
                curveTo(9.88f, 22.75f, 7.85f, 22.07f, 6.18f, 20.82f)
                lineTo(7.26f, 19.74f)
                curveTo(8.64f, 20.72f, 10.28f, 21.25f, 12f, 21.25f)
                curveTo(16.55f, 21.25f, 20.25f, 17.55f, 20.25f, 13f)
                verticalLineTo(11f)
                curveTo(20.25f, 10.59f, 20.59f, 10.25f, 21f, 10.25f)
                curveTo(21.41f, 10.25f, 21.75f, 10.59f, 21.75f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.769f, 2.229f)
                curveTo(21.469f, 1.929f, 20.979f, 1.929f, 20.679f, 2.229f)
                lineTo(2.229f, 20.689f)
                curveTo(1.929f, 20.989f, 1.929f, 21.479f, 2.229f, 21.779f)
                curveTo(2.379f, 21.919f, 2.569f, 21.999f, 2.769f, 21.999f)
                curveTo(2.969f, 21.999f, 3.159f, 21.919f, 3.309f, 21.769f)
                lineTo(21.769f, 3.309f)
                curveTo(22.079f, 3.009f, 22.079f, 2.529f, 21.769f, 2.229f)
                close()
            }
        }.build()

        return _MicrophoneSlash1!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneSlash1: ImageVector? = null
