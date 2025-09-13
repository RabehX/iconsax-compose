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

val Iconsax.Outline.BoxTick: ImageVector
    get() {
        if (_BoxTick != null) {
            return _BoxTick!!
        }
        _BoxTick = ImageVector.Builder(
            name = "Outline.BoxTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.001f, 22.75f)
                curveTo(17.381f, 22.75f, 15.851f, 21.91f, 14.991f, 20.53f)
                curveTo(14.531f, 19.82f, 14.271f, 18.97f, 14.251f, 18.1f)
                curveTo(14.221f, 16.64f, 14.841f, 15.28f, 15.951f, 14.36f)
                curveTo(16.781f, 13.67f, 17.821f, 13.28f, 18.891f, 13.25f)
                curveTo(20.191f, 13.24f, 21.361f, 13.69f, 22.281f, 14.57f)
                curveTo(23.201f, 15.45f, 23.721f, 16.63f, 23.741f, 17.9f)
                curveTo(23.761f, 18.77f, 23.541f, 19.62f, 23.101f, 20.37f)
                curveTo(22.861f, 20.79f, 22.551f, 21.18f, 22.181f, 21.51f)
                curveTo(21.361f, 22.28f, 20.261f, 22.73f, 19.091f, 22.75f)
                curveTo(19.071f, 22.75f, 19.041f, 22.75f, 19.001f, 22.75f)
                close()
                moveTo(19.001f, 14.75f)
                curveTo(18.981f, 14.75f, 18.951f, 14.75f, 18.931f, 14.75f)
                curveTo(18.191f, 14.77f, 17.491f, 15.03f, 16.911f, 15.51f)
                curveTo(16.151f, 16.14f, 15.731f, 17.07f, 15.751f, 18.07f)
                curveTo(15.761f, 18.66f, 15.941f, 19.24f, 16.251f, 19.73f)
                curveTo(16.861f, 20.71f, 17.921f, 21.31f, 19.061f, 21.25f)
                curveTo(19.851f, 21.23f, 20.601f, 20.93f, 21.171f, 20.4f)
                curveTo(21.431f, 20.17f, 21.641f, 19.91f, 21.801f, 19.63f)
                curveTo(22.101f, 19.11f, 22.251f, 18.53f, 22.241f, 17.94f)
                curveTo(22.221f, 17.07f, 21.871f, 16.26f, 21.241f, 15.66f)
                curveTo(20.641f, 15.07f, 19.841f, 14.75f, 19.001f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.449f, 19.75f)
                curveTo(18.259f, 19.75f, 18.079f, 19.68f, 17.929f, 19.54f)
                lineTo(16.919f, 18.58f)
                curveTo(16.619f, 18.29f, 16.609f, 17.82f, 16.899f, 17.52f)
                curveTo(17.189f, 17.22f, 17.659f, 17.21f, 17.959f, 17.5f)
                lineTo(18.449f, 17.97f)
                lineTo(20.019f, 16.45f)
                curveTo(20.319f, 16.16f, 20.789f, 16.17f, 21.079f, 16.47f)
                curveTo(21.369f, 16.77f, 21.359f, 17.24f, 21.059f, 17.53f)
                lineTo(18.969f, 19.55f)
                curveTo(18.819f, 19.68f, 18.629f, 19.75f, 18.449f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 13.3f)
                curveTo(11.869f, 13.3f, 11.739f, 13.27f, 11.619f, 13.2f)
                lineTo(2.789f, 8.09f)
                curveTo(2.429f, 7.88f, 2.309f, 7.42f, 2.519f, 7.06f)
                curveTo(2.729f, 6.7f, 3.189f, 6.58f, 3.539f, 6.79f)
                lineTo(11.989f, 11.68f)
                lineTo(20.389f, 6.82f)
                curveTo(20.749f, 6.61f, 21.209f, 6.74f, 21.409f, 7.09f)
                curveTo(21.619f, 7.45f, 21.489f, 7.91f, 21.139f, 8.12f)
                lineTo(12.369f, 13.2f)
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
                moveTo(11.999f, 22.75f)
                curveTo(11.119f, 22.75f, 10.239f, 22.56f, 9.559f, 22.17f)
                lineTo(4.219f, 19.21f)
                curveTo(2.769f, 18.41f, 1.629f, 16.48f, 1.629f, 14.82f)
                verticalLineTo(9.16f)
                curveTo(1.629f, 7.5f, 2.769f, 5.58f, 4.219f, 4.77f)
                lineTo(9.559f, 1.81f)
                curveTo(10.919f, 1.04f, 13.059f, 1.04f, 14.429f, 1.81f)
                lineTo(19.769f, 4.77f)
                curveTo(21.219f, 5.57f, 22.359f, 7.5f, 22.359f, 9.16f)
                verticalLineTo(14.82f)
                curveTo(22.359f, 14.92f, 22.359f, 15f, 22.339f, 15.1f)
                curveTo(22.289f, 15.36f, 22.099f, 15.58f, 21.849f, 15.66f)
                curveTo(21.599f, 15.75f, 21.319f, 15.69f, 21.109f, 15.52f)
                curveTo(19.959f, 14.52f, 18.179f, 14.48f, 16.969f, 15.45f)
                curveTo(16.199f, 16.06f, 15.749f, 16.99f, 15.749f, 17.98f)
                curveTo(15.749f, 18.57f, 15.909f, 19.15f, 16.219f, 19.65f)
                curveTo(16.299f, 19.79f, 16.379f, 19.9f, 16.469f, 20.01f)
                curveTo(16.619f, 20.18f, 16.679f, 20.41f, 16.639f, 20.63f)
                curveTo(16.599f, 20.85f, 16.459f, 21.04f, 16.259f, 21.15f)
                lineTo(14.429f, 22.16f)
                curveTo(13.749f, 22.56f, 12.879f, 22.75f, 11.999f, 22.75f)
                close()
                moveTo(11.999f, 2.75f)
                curveTo(11.379f, 2.75f, 10.749f, 2.88f, 10.299f, 3.13f)
                lineTo(4.959f, 6.09f)
                curveTo(3.989f, 6.62f, 3.149f, 8.06f, 3.149f, 9.16f)
                verticalLineTo(14.82f)
                curveTo(3.149f, 15.92f, 3.999f, 17.36f, 4.959f, 17.89f)
                lineTo(10.299f, 20.85f)
                curveTo(11.209f, 21.36f, 12.799f, 21.36f, 13.709f, 20.85f)
                lineTo(14.829f, 20.23f)
                curveTo(14.459f, 19.56f, 14.259f, 18.78f, 14.259f, 17.98f)
                curveTo(14.259f, 16.52f, 14.909f, 15.17f, 16.039f, 14.27f)
                curveTo(17.399f, 13.18f, 19.339f, 12.95f, 20.869f, 13.6f)
                verticalLineTo(9.14f)
                curveTo(20.869f, 8.04f, 20.019f, 6.6f, 19.059f, 6.07f)
                lineTo(13.719f, 3.11f)
                curveTo(13.249f, 2.88f, 12.619f, 2.75f, 11.999f, 2.75f)
                close()
            }
        }.build()

        return _BoxTick!!
    }

@Suppress("ObjectPropertyName")
private var _BoxTick: ImageVector? = null
