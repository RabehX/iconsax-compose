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

val Iconsax.Outline.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) {
            return _EyeSlash!!
        }
        _EyeSlash = ImageVector.Builder(
            name = "Outline.EyeSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.47f, 15.28f)
                curveTo(9.28f, 15.28f, 9.09f, 15.21f, 8.94f, 15.06f)
                curveTo(8.12f, 14.24f, 7.67f, 13.15f, 7.67f, 12f)
                curveTo(7.67f, 9.61f, 9.61f, 7.67f, 12f, 7.67f)
                curveTo(13.15f, 7.67f, 14.24f, 8.12f, 15.06f, 8.94f)
                curveTo(15.2f, 9.08f, 15.28f, 9.27f, 15.28f, 9.47f)
                curveTo(15.28f, 9.67f, 15.2f, 9.86f, 15.06f, 10f)
                lineTo(10f, 15.06f)
                curveTo(9.85f, 15.21f, 9.66f, 15.28f, 9.47f, 15.28f)
                close()
                moveTo(12f, 9.17f)
                curveTo(10.44f, 9.17f, 9.17f, 10.44f, 9.17f, 12f)
                curveTo(9.17f, 12.5f, 9.3f, 12.98f, 9.54f, 13.4f)
                lineTo(13.4f, 9.54f)
                curveTo(12.98f, 9.3f, 12.5f, 9.17f, 12f, 9.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.6f, 18.51f)
                curveTo(5.43f, 18.51f, 5.25f, 18.45f, 5.11f, 18.33f)
                curveTo(4.04f, 17.42f, 3.08f, 16.3f, 2.26f, 15f)
                curveTo(1.2f, 13.35f, 1.2f, 10.66f, 2.26f, 9f)
                curveTo(4.7f, 5.18f, 8.25f, 2.98f, 12f, 2.98f)
                curveTo(14.2f, 2.98f, 16.37f, 3.74f, 18.27f, 5.17f)
                curveTo(18.6f, 5.42f, 18.67f, 5.89f, 18.42f, 6.22f)
                curveTo(18.17f, 6.55f, 17.7f, 6.62f, 17.37f, 6.37f)
                curveTo(15.73f, 5.13f, 13.87f, 4.48f, 12f, 4.48f)
                curveTo(8.77f, 4.48f, 5.68f, 6.42f, 3.52f, 9.81f)
                curveTo(2.77f, 10.98f, 2.77f, 13.02f, 3.52f, 14.19f)
                curveTo(4.27f, 15.36f, 5.13f, 16.37f, 6.08f, 17.19f)
                curveTo(6.39f, 17.46f, 6.43f, 17.93f, 6.16f, 18.25f)
                curveTo(6.02f, 18.42f, 5.81f, 18.51f, 5.6f, 18.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 21.02f)
                curveTo(10.671f, 21.02f, 9.371f, 20.75f, 8.121f, 20.22f)
                curveTo(7.741f, 20.06f, 7.561f, 19.62f, 7.721f, 19.24f)
                curveTo(7.881f, 18.86f, 8.321f, 18.68f, 8.701f, 18.84f)
                curveTo(9.761f, 19.29f, 10.871f, 19.52f, 11.991f, 19.52f)
                curveTo(15.221f, 19.52f, 18.311f, 17.58f, 20.471f, 14.19f)
                curveTo(21.221f, 13.02f, 21.221f, 10.98f, 20.471f, 9.81f)
                curveTo(20.161f, 9.32f, 19.82f, 8.85f, 19.461f, 8.41f)
                curveTo(19.201f, 8.09f, 19.251f, 7.62f, 19.571f, 7.35f)
                curveTo(19.891f, 7.09f, 20.361f, 7.13f, 20.631f, 7.46f)
                curveTo(21.021f, 7.94f, 21.401f, 8.46f, 21.741f, 9f)
                curveTo(22.801f, 10.65f, 22.801f, 13.34f, 21.741f, 15f)
                curveTo(19.301f, 18.82f, 15.751f, 21.02f, 12.001f, 21.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.69f, 16.27f)
                curveTo(12.34f, 16.27f, 12.02f, 16.02f, 11.95f, 15.66f)
                curveTo(11.87f, 15.25f, 12.14f, 14.86f, 12.55f, 14.79f)
                curveTo(13.65f, 14.59f, 14.57f, 13.67f, 14.77f, 12.57f)
                curveTo(14.85f, 12.16f, 15.24f, 11.9f, 15.65f, 11.97f)
                curveTo(16.06f, 12.05f, 16.33f, 12.44f, 16.25f, 12.85f)
                curveTo(15.93f, 14.58f, 14.55f, 15.95f, 12.83f, 16.27f)
                curveTo(12.78f, 16.26f, 12.74f, 16.27f, 12.69f, 16.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(8.939f, 14f)
                curveTo(9.229f, 13.71f, 9.709f, 13.71f, 9.999f, 14f)
                curveTo(10.29f, 14.29f, 10.29f, 14.77f, 9.999f, 15.06f)
                lineTo(2.529f, 22.53f)
                curveTo(2.379f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.531f, 10.22f)
                curveTo(14.341f, 10.22f, 14.151f, 10.15f, 14.001f, 10f)
                curveTo(13.711f, 9.71f, 13.711f, 9.23f, 14.001f, 8.94f)
                lineTo(21.471f, 1.47f)
                curveTo(21.761f, 1.18f, 22.241f, 1.18f, 22.531f, 1.47f)
                curveTo(22.821f, 1.76f, 22.821f, 2.24f, 22.531f, 2.53f)
                lineTo(15.061f, 10f)
                curveTo(14.911f, 10.15f, 14.721f, 10.22f, 14.531f, 10.22f)
                close()
            }
        }.build()

        return _EyeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _EyeSlash: ImageVector? = null
