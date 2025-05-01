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

val Iconsax.Outline.Ranking: ImageVector
    get() {
        if (_Ranking != null) {
            return _Ranking!!
        }
        _Ranking = ImageVector.Builder(
            name = "Outline.Ranking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.241f, 22.67f)
                curveTo(15.811f, 22.67f, 15.271f, 22.54f, 14.601f, 22.14f)
                lineTo(12.361f, 20.81f)
                curveTo(12.191f, 20.71f, 11.811f, 20.71f, 11.641f, 20.81f)
                lineTo(9.401f, 22.14f)
                curveTo(7.981f, 22.98f, 7.121f, 22.63f, 6.741f, 22.35f)
                curveTo(6.361f, 22.07f, 5.761f, 21.35f, 6.131f, 19.75f)
                lineTo(6.661f, 17.44f)
                curveTo(6.701f, 17.26f, 6.601f, 16.92f, 6.471f, 16.78f)
                lineTo(4.611f, 14.92f)
                curveTo(3.611f, 13.92f, 3.691f, 13.05f, 3.831f, 12.61f)
                curveTo(3.971f, 12.17f, 4.411f, 11.42f, 5.801f, 11.18f)
                lineTo(8.191f, 10.78f)
                curveTo(8.361f, 10.75f, 8.631f, 10.55f, 8.701f, 10.4f)
                lineTo(10.021f, 7.76f)
                curveTo(10.671f, 6.47f, 11.531f, 6.27f, 11.991f, 6.27f)
                curveTo(12.451f, 6.27f, 13.311f, 6.46f, 13.961f, 7.76f)
                lineTo(15.281f, 10.4f)
                curveTo(15.361f, 10.55f, 15.631f, 10.75f, 15.791f, 10.78f)
                lineTo(18.181f, 11.18f)
                curveTo(19.571f, 11.41f, 20.011f, 12.17f, 20.151f, 12.61f)
                curveTo(20.291f, 13.05f, 20.371f, 13.92f, 19.371f, 14.92f)
                lineTo(17.511f, 16.78f)
                curveTo(17.381f, 16.91f, 17.281f, 17.26f, 17.321f, 17.44f)
                lineTo(17.851f, 19.74f)
                curveTo(18.221f, 21.35f, 17.631f, 22.06f, 17.241f, 22.34f)
                curveTo(17.061f, 22.5f, 16.721f, 22.67f, 16.241f, 22.67f)
                close()
                moveTo(12.001f, 19.24f)
                curveTo(12.401f, 19.24f, 12.801f, 19.33f, 13.121f, 19.52f)
                lineTo(15.361f, 20.85f)
                curveTo(15.951f, 21.2f, 16.301f, 21.2f, 16.371f, 21.14f)
                curveTo(16.451f, 21.08f, 16.551f, 20.75f, 16.401f, 20.09f)
                lineTo(15.871f, 17.79f)
                curveTo(15.711f, 17.11f, 15.971f, 16.23f, 16.461f, 15.74f)
                lineTo(18.321f, 13.88f)
                curveTo(18.691f, 13.51f, 18.771f, 13.22f, 18.731f, 13.09f)
                curveTo(18.691f, 12.96f, 18.461f, 12.77f, 17.941f, 12.69f)
                lineTo(15.551f, 12.29f)
                curveTo(14.911f, 12.18f, 14.231f, 11.68f, 13.941f, 11.1f)
                lineTo(12.621f, 8.46f)
                curveTo(12.391f, 8.01f, 12.141f, 7.8f, 11.991f, 7.8f)
                curveTo(11.841f, 7.8f, 11.591f, 8f, 11.361f, 8.46f)
                lineTo(10.041f, 11.1f)
                curveTo(9.751f, 11.68f, 9.071f, 12.18f, 8.431f, 12.29f)
                lineTo(6.041f, 12.69f)
                curveTo(5.521f, 12.78f, 5.291f, 12.96f, 5.251f, 13.09f)
                curveTo(5.211f, 13.22f, 5.291f, 13.51f, 5.661f, 13.88f)
                lineTo(7.521f, 15.74f)
                curveTo(8.011f, 16.23f, 8.271f, 17.12f, 8.111f, 17.79f)
                lineTo(7.581f, 20.1f)
                curveTo(7.431f, 20.77f, 7.531f, 21.1f, 7.611f, 21.15f)
                curveTo(7.691f, 21.21f, 8.041f, 21.21f, 8.621f, 20.86f)
                lineTo(10.861f, 19.53f)
                curveTo(11.201f, 19.34f, 11.601f, 19.24f, 12.001f, 19.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 9.75f)
                curveTo(5.59f, 9.75f, 5.25f, 9.41f, 5.25f, 9f)
                verticalLineTo(2f)
                curveTo(5.25f, 1.59f, 5.59f, 1.25f, 6f, 1.25f)
                curveTo(6.41f, 1.25f, 6.75f, 1.59f, 6.75f, 2f)
                verticalLineTo(9f)
                curveTo(6.75f, 9.41f, 6.41f, 9.75f, 6f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 9.75f)
                curveTo(17.59f, 9.75f, 17.25f, 9.41f, 17.25f, 9f)
                verticalLineTo(2f)
                curveTo(17.25f, 1.59f, 17.59f, 1.25f, 18f, 1.25f)
                curveTo(18.41f, 1.25f, 18.75f, 1.59f, 18.75f, 2f)
                verticalLineTo(9f)
                curveTo(18.75f, 9.41f, 18.41f, 9.75f, 18f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4.75f)
                curveTo(11.59f, 4.75f, 11.25f, 4.41f, 11.25f, 4f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(4f)
                curveTo(12.75f, 4.41f, 12.41f, 4.75f, 12f, 4.75f)
                close()
            }
        }.build()

        return _Ranking!!
    }

@Suppress("ObjectPropertyName")
private var _Ranking: ImageVector? = null
