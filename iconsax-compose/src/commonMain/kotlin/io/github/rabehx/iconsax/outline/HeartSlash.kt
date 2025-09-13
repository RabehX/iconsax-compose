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

val Iconsax.Outline.HeartSlash: ImageVector
    get() {
        if (_HeartSlash != null) {
            return _HeartSlash!!
        }
        _HeartSlash = ImageVector.Builder(
            name = "Outline.HeartSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.11f, 18.25f)
                curveTo(5.93f, 18.25f, 5.74f, 18.18f, 5.6f, 18.05f)
                curveTo(3.62f, 16.19f, 1.25f, 13.06f, 1.25f, 8.69f)
                curveTo(1.25f, 5.19f, 4.08f, 2.35f, 7.56f, 2.35f)
                curveTo(9.25f, 2.35f, 10.83f, 3.01f, 12f, 4.19f)
                curveTo(13.17f, 3.01f, 14.75f, 2.35f, 16.44f, 2.35f)
                curveTo(17.7f, 2.35f, 18.92f, 2.73f, 19.97f, 3.43f)
                curveTo(20.31f, 3.66f, 20.4f, 4.13f, 20.17f, 4.47f)
                curveTo(19.94f, 4.81f, 19.47f, 4.9f, 19.13f, 4.67f)
                curveTo(18.34f, 4.13f, 17.41f, 3.84f, 16.45f, 3.84f)
                curveTo(14.93f, 3.84f, 13.52f, 4.55f, 12.61f, 5.78f)
                curveTo(12.33f, 6.16f, 11.69f, 6.16f, 11.41f, 5.78f)
                curveTo(10.49f, 4.55f, 9.09f, 3.84f, 7.57f, 3.84f)
                curveTo(4.92f, 3.84f, 2.76f, 6.01f, 2.76f, 8.68f)
                curveTo(2.76f, 12.52f, 4.87f, 15.29f, 6.64f, 16.95f)
                curveTo(6.94f, 17.23f, 6.96f, 17.71f, 6.68f, 18.01f)
                curveTo(6.51f, 18.17f, 6.31f, 18.25f, 6.11f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 21.65f)
                curveTo(11.689f, 21.65f, 11.389f, 21.61f, 11.139f, 21.52f)
                curveTo(10.389f, 21.26f, 9.499f, 20.84f, 8.639f, 20.33f)
                curveTo(8.279f, 20.12f, 8.169f, 19.66f, 8.379f, 19.3f)
                curveTo(8.589f, 18.95f, 9.049f, 18.83f, 9.409f, 19.04f)
                curveTo(10.189f, 19.5f, 10.979f, 19.88f, 11.629f, 20.1f)
                curveTo(11.809f, 20.16f, 12.199f, 20.16f, 12.379f, 20.1f)
                curveTo(14.679f, 19.31f, 21.259f, 15.52f, 21.259f, 8.68f)
                curveTo(21.259f, 8.18f, 21.179f, 7.69f, 21.039f, 7.22f)
                curveTo(20.919f, 6.82f, 21.129f, 6.4f, 21.529f, 6.28f)
                curveTo(21.929f, 6.16f, 22.349f, 6.38f, 22.469f, 6.77f)
                curveTo(22.659f, 7.39f, 22.759f, 8.03f, 22.759f, 8.68f)
                curveTo(22.759f, 15.56f, 16.689f, 20.2f, 12.869f, 21.51f)
                curveTo(12.609f, 21.61f, 12.309f, 21.65f, 11.999f, 21.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(21.469f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.529f, 1.47f)
                curveTo(22.819f, 1.76f, 22.819f, 2.24f, 22.529f, 2.53f)
                lineTo(2.53f, 22.53f)
                curveTo(2.38f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
        }.build()

        return _HeartSlash!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSlash: ImageVector? = null
