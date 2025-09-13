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

val Iconsax.Outline.Box: ImageVector
    get() {
        if (_Box != null) {
            return _Box!!
        }
        _Box = ImageVector.Builder(
            name = "Outline.Box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 13.3f)
                curveTo(11.869f, 13.3f, 11.739f, 13.27f, 11.619f, 13.2f)
                lineTo(2.789f, 8.09f)
                curveTo(2.429f, 7.88f, 2.309f, 7.42f, 2.519f, 7.06f)
                curveTo(2.729f, 6.7f, 3.179f, 6.58f, 3.549f, 6.79f)
                lineTo(11.999f, 11.68f)
                lineTo(20.399f, 6.82f)
                curveTo(20.759f, 6.61f, 21.219f, 6.74f, 21.429f, 7.09f)
                curveTo(21.639f, 7.45f, 21.509f, 7.91f, 21.159f, 8.12f)
                lineTo(12.389f, 13.2f)
                curveTo(12.259f, 13.26f, 12.129f, 13.3f, 11.999f, 13.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.36f)
                curveTo(11.59f, 22.36f, 11.25f, 22.02f, 11.25f, 21.61f)
                verticalLineTo(12.54f)
                curveTo(11.25f, 12.13f, 11.59f, 11.79f, 12f, 11.79f)
                curveTo(12.41f, 11.79f, 12.75f, 12.13f, 12.75f, 12.54f)
                verticalLineTo(21.61f)
                curveTo(12.75f, 22.02f, 12.41f, 22.36f, 12f, 22.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 22.75f)
                curveTo(11.121f, 22.75f, 10.251f, 22.56f, 9.561f, 22.18f)
                lineTo(4.221f, 19.21f)
                curveTo(2.771f, 18.41f, 1.641f, 16.48f, 1.641f, 14.82f)
                verticalLineTo(9.17f)
                curveTo(1.641f, 7.51f, 2.771f, 5.59f, 4.221f, 4.78f)
                lineTo(9.561f, 1.82f)
                curveTo(10.931f, 1.06f, 13.071f, 1.06f, 14.441f, 1.82f)
                lineTo(19.781f, 4.79f)
                curveTo(21.231f, 5.59f, 22.361f, 7.52f, 22.361f, 9.18f)
                verticalLineTo(14.83f)
                curveTo(22.361f, 16.49f, 21.231f, 18.41f, 19.781f, 19.22f)
                lineTo(14.441f, 22.18f)
                curveTo(13.751f, 22.56f, 12.881f, 22.75f, 12.001f, 22.75f)
                close()
                moveTo(12.001f, 2.75f)
                curveTo(11.371f, 2.75f, 10.751f, 2.88f, 10.291f, 3.13f)
                lineTo(4.951f, 6.1f)
                curveTo(3.991f, 6.64f, 3.141f, 8.07f, 3.141f, 9.18f)
                verticalLineTo(14.83f)
                curveTo(3.141f, 15.93f, 3.991f, 17.37f, 4.951f, 17.91f)
                lineTo(10.291f, 20.88f)
                curveTo(11.201f, 21.39f, 12.801f, 21.39f, 13.711f, 20.88f)
                lineTo(19.051f, 17.91f)
                curveTo(20.011f, 17.37f, 20.861f, 15.94f, 20.861f, 14.83f)
                verticalLineTo(9.18f)
                curveTo(20.861f, 8.08f, 20.011f, 6.64f, 19.051f, 6.1f)
                lineTo(13.711f, 3.13f)
                curveTo(13.251f, 2.88f, 12.631f, 2.75f, 12.001f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.001f, 13.99f)
                curveTo(16.591f, 13.99f, 16.251f, 13.65f, 16.251f, 13.24f)
                verticalLineTo(10.02f)
                lineTo(7.131f, 4.76f)
                curveTo(6.771f, 4.55f, 6.651f, 4.09f, 6.861f, 3.74f)
                curveTo(7.071f, 3.38f, 7.521f, 3.26f, 7.881f, 3.47f)
                lineTo(17.371f, 8.95f)
                curveTo(17.601f, 9.08f, 17.751f, 9.33f, 17.751f, 9.6f)
                verticalLineTo(13.26f)
                curveTo(17.751f, 13.65f, 17.411f, 13.99f, 17.001f, 13.99f)
                close()
            }
        }.build()

        return _Box!!
    }

@Suppress("ObjectPropertyName")
private var _Box: ImageVector? = null
