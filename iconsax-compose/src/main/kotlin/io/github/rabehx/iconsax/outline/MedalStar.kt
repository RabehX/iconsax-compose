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

val Iconsax.Outline.MedalStar: ImageVector
    get() {
        if (_MedalStar != null) {
            return _MedalStar!!
        }
        _MedalStar = ImageVector.Builder(
            name = "Outline.MedalStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.75f)
                curveTo(11.6f, 16.75f, 11.2f, 16.72f, 10.82f, 16.65f)
                curveTo(8.7f, 16.34f, 6.77f, 15.12f, 5.55f, 13.31f)
                curveTo(4.7f, 12.03f, 4.25f, 10.54f, 4.25f, 9f)
                curveTo(4.25f, 4.73f, 7.73f, 1.25f, 12f, 1.25f)
                curveTo(16.27f, 1.25f, 19.75f, 4.73f, 19.75f, 9f)
                curveTo(19.75f, 10.54f, 19.3f, 12.03f, 18.45f, 13.31f)
                curveTo(17.22f, 15.13f, 15.29f, 16.34f, 13.15f, 16.66f)
                curveTo(12.8f, 16.72f, 12.4f, 16.75f, 12f, 16.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(8.55f, 2.75f, 5.75f, 5.55f, 5.75f, 9f)
                curveTo(5.75f, 10.25f, 6.11f, 11.45f, 6.79f, 12.47f)
                curveTo(7.78f, 13.93f, 9.33f, 14.91f, 11.05f, 15.16f)
                curveTo(11.69f, 15.27f, 12.32f, 15.27f, 12.91f, 15.16f)
                curveTo(14.66f, 14.91f, 16.21f, 13.92f, 17.2f, 12.46f)
                curveTo(17.88f, 11.44f, 18.24f, 10.24f, 18.24f, 8.99f)
                curveTo(18.25f, 5.55f, 15.45f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.469f, 22.59f)
                curveTo(6.329f, 22.59f, 6.199f, 22.57f, 6.059f, 22.54f)
                curveTo(5.409f, 22.39f, 4.909f, 21.89f, 4.759f, 21.24f)
                lineTo(4.409f, 19.77f)
                curveTo(4.389f, 19.68f, 4.319f, 19.61f, 4.219f, 19.58f)
                lineTo(2.569f, 19.19f)
                curveTo(1.949f, 19.04f, 1.459f, 18.58f, 1.289f, 17.97f)
                curveTo(1.119f, 17.36f, 1.289f, 16.7f, 1.739f, 16.25f)
                lineTo(5.639f, 12.35f)
                curveTo(5.799f, 12.19f, 6.019f, 12.11f, 6.239f, 12.13f)
                curveTo(6.459f, 12.15f, 6.659f, 12.27f, 6.789f, 12.46f)
                curveTo(7.779f, 13.92f, 9.329f, 14.91f, 11.059f, 15.16f)
                curveTo(11.699f, 15.27f, 12.329f, 15.27f, 12.919f, 15.16f)
                curveTo(14.669f, 14.91f, 16.219f, 13.92f, 17.209f, 12.46f)
                curveTo(17.329f, 12.27f, 17.539f, 12.15f, 17.759f, 12.13f)
                curveTo(17.979f, 12.11f, 18.199f, 12.19f, 18.359f, 12.35f)
                lineTo(22.259f, 16.25f)
                curveTo(22.709f, 16.7f, 22.879f, 17.36f, 22.709f, 17.97f)
                curveTo(22.539f, 18.58f, 22.039f, 19.05f, 21.429f, 19.19f)
                lineTo(19.779f, 19.58f)
                curveTo(19.689f, 19.6f, 19.619f, 19.67f, 19.589f, 19.77f)
                lineTo(19.239f, 21.24f)
                curveTo(19.089f, 21.89f, 18.589f, 22.39f, 17.939f, 22.54f)
                curveTo(17.289f, 22.7f, 16.619f, 22.47f, 16.199f, 21.96f)
                lineTo(11.999f, 17.13f)
                lineTo(7.799f, 21.97f)
                curveTo(7.459f, 22.37f, 6.979f, 22.59f, 6.469f, 22.59f)
                close()
                moveTo(6.089f, 14.03f)
                lineTo(2.799f, 17.32f)
                curveTo(2.709f, 17.41f, 2.719f, 17.51f, 2.739f, 17.57f)
                curveTo(2.749f, 17.62f, 2.799f, 17.72f, 2.919f, 17.74f)
                lineTo(4.569f, 18.13f)
                curveTo(5.219f, 18.28f, 5.719f, 18.78f, 5.869f, 19.43f)
                lineTo(6.219f, 20.9f)
                curveTo(6.249f, 21.03f, 6.349f, 21.07f, 6.409f, 21.09f)
                curveTo(6.469f, 21.1f, 6.569f, 21.11f, 6.659f, 21.01f)
                lineTo(10.489f, 16.6f)
                curveTo(8.789f, 16.27f, 7.229f, 15.36f, 6.089f, 14.03f)
                close()
                moveTo(13.509f, 16.59f)
                lineTo(17.339f, 20.99f)
                curveTo(17.429f, 21.1f, 17.539f, 21.1f, 17.599f, 21.08f)
                curveTo(17.659f, 21.07f, 17.749f, 21.02f, 17.789f, 20.89f)
                lineTo(18.139f, 19.42f)
                curveTo(18.289f, 18.77f, 18.789f, 18.27f, 19.439f, 18.12f)
                lineTo(21.089f, 17.73f)
                curveTo(21.209f, 17.7f, 21.259f, 17.61f, 21.269f, 17.56f)
                curveTo(21.289f, 17.51f, 21.299f, 17.4f, 21.209f, 17.31f)
                lineTo(17.919f, 14.02f)
                curveTo(16.769f, 15.35f, 15.219f, 16.26f, 13.509f, 16.59f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.891f, 12.89f)
                curveTo(13.631f, 12.89f, 13.321f, 12.82f, 12.951f, 12.6f)
                lineTo(12.001f, 12.03f)
                lineTo(11.051f, 12.59f)
                curveTo(10.181f, 13.11f, 9.611f, 12.81f, 9.401f, 12.66f)
                curveTo(9.191f, 12.51f, 8.741f, 12.06f, 8.971f, 11.07f)
                lineTo(9.211f, 10.04f)
                lineTo(8.411f, 9.3f)
                curveTo(7.971f, 8.86f, 7.811f, 8.33f, 7.961f, 7.85f)
                curveTo(8.111f, 7.37f, 8.551f, 7.03f, 9.171f, 6.93f)
                lineTo(10.241f, 6.75f)
                lineTo(10.751f, 5.63f)
                curveTo(11.041f, 5.06f, 11.491f, 4.74f, 12.001f, 4.74f)
                curveTo(12.511f, 4.74f, 12.971f, 5.07f, 13.251f, 5.64f)
                lineTo(13.841f, 6.82f)
                lineTo(14.831f, 6.94f)
                curveTo(15.441f, 7.04f, 15.881f, 7.38f, 16.041f, 7.86f)
                curveTo(16.191f, 8.34f, 16.031f, 8.87f, 15.591f, 9.31f)
                lineTo(14.761f, 10.14f)
                lineTo(15.021f, 11.07f)
                curveTo(15.251f, 12.06f, 14.801f, 12.51f, 14.591f, 12.66f)
                curveTo(14.481f, 12.75f, 14.241f, 12.89f, 13.891f, 12.89f)
                close()
                moveTo(9.611f, 8.39f)
                lineTo(10.301f, 9.08f)
                curveTo(10.621f, 9.4f, 10.781f, 9.94f, 10.681f, 10.38f)
                lineTo(10.491f, 11.18f)
                lineTo(11.291f, 10.71f)
                curveTo(11.721f, 10.46f, 12.301f, 10.46f, 12.721f, 10.71f)
                lineTo(13.521f, 11.18f)
                lineTo(13.341f, 10.38f)
                curveTo(13.241f, 9.93f, 13.391f, 9.4f, 13.711f, 9.08f)
                lineTo(14.401f, 8.39f)
                lineTo(13.531f, 8.24f)
                curveTo(13.111f, 8.17f, 12.691f, 7.86f, 12.501f, 7.48f)
                lineTo(12.001f, 6.5f)
                lineTo(11.501f, 7.5f)
                curveTo(11.321f, 7.87f, 10.901f, 8.19f, 10.481f, 8.26f)
                lineTo(9.611f, 8.39f)
                close()
            }
        }.build()

        return _MedalStar!!
    }

@Suppress("ObjectPropertyName")
private var _MedalStar: ImageVector? = null
