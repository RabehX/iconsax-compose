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


val Iconsax.Filled.VideoSlash: ImageVector
    get() {
        if (_VideoSlash != null) {
            return _VideoSlash!!
        }
        _VideoSlash = ImageVector.Builder(
            name = "Filled.VideoSlash",
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
                moveTo(17.74f, 7.57f)
                curveTo(17.75f, 7.64f, 17.75f, 7.72f, 17.74f, 7.79f)
                curveTo(17.74f, 7.72f, 17.73f, 7.65f, 17.73f, 7.58f)
                lineTo(17.74f, 7.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.279f, 6.56f)
                lineTo(3.829f, 20.01f)
                curveTo(2.429f, 19.12f, 1.879f, 17.53f, 1.879f, 16f)
                verticalLineTo(8f)
                curveTo(1.879f, 4.58f, 3.209f, 3.25f, 6.629f, 3.25f)
                horizontalLineTo(12.629f)
                curveTo(15.519f, 3.25f, 16.909f, 4.2f, 17.279f, 6.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.4f, 2.229f)
                curveTo(21.1f, 1.929f, 20.61f, 1.929f, 20.31f, 2.229f)
                lineTo(1.85f, 20.689f)
                curveTo(1.55f, 20.989f, 1.55f, 21.479f, 1.85f, 21.779f)
                curveTo(2f, 21.919f, 2.2f, 21.999f, 2.39f, 21.999f)
                curveTo(2.59f, 21.999f, 2.78f, 21.919f, 2.93f, 21.769f)
                lineTo(21.4f, 3.309f)
                curveTo(21.7f, 3.009f, 21.7f, 2.529f, 21.4f, 2.229f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.38f, 8.38f)
                verticalLineTo(15.62f)
                curveTo(22.38f, 17.051f, 21.68f, 17.621f, 21.28f, 17.83f)
                curveTo(21.09f, 17.931f, 20.79f, 18.041f, 20.42f, 18.041f)
                curveTo(19.99f, 18.041f, 19.46f, 17.9f, 18.84f, 17.461f)
                lineTo(17.36f, 16.42f)
                curveTo(17.29f, 18.631f, 16.59f, 19.89f, 15f, 20.42f)
                curveTo(14.36f, 20.65f, 13.57f, 20.75f, 12.62f, 20.75f)
                horizontalLineTo(6.62f)
                curveTo(6.38f, 20.75f, 6.15f, 20.74f, 5.91f, 20.711f)
                lineTo(15f, 11.63f)
                lineTo(20.65f, 5.98f)
                curveTo(20.91f, 6f, 21.12f, 6.08f, 21.28f, 6.17f)
                curveTo(21.68f, 6.38f, 22.38f, 6.95f, 22.38f, 8.38f)
                close()
            }
        }.build()

        return _VideoSlash!!
    }

@Suppress("ObjectPropertyName")
private var _VideoSlash: ImageVector? = null
