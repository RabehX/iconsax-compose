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

val Iconsax.Outline.BoxRemove: ImageVector
    get() {
        if (_BoxRemove != null) {
            return _BoxRemove!!
        }
        _BoxRemove = ImageVector.Builder(
            name = "Outline.BoxRemove",
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
                curveTo(17.399f, 13.18f, 19.349f, 12.95f, 20.869f, 13.6f)
                verticalLineTo(9.14f)
                curveTo(20.869f, 8.04f, 20.019f, 6.6f, 19.059f, 6.07f)
                lineTo(13.719f, 3.11f)
                curveTo(13.249f, 2.88f, 12.619f, 2.75f, 11.999f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(17.34f, 22.75f, 15.78f, 21.87f, 14.94f, 20.44f)
                curveTo(14.49f, 19.72f, 14.25f, 18.87f, 14.25f, 18f)
                curveTo(14.25f, 16.54f, 14.9f, 15.19f, 16.03f, 14.29f)
                curveTo(16.87f, 13.62f, 17.93f, 13.25f, 19f, 13.25f)
                curveTo(21.62f, 13.25f, 23.75f, 15.38f, 23.75f, 18f)
                curveTo(23.75f, 18.87f, 23.51f, 19.72f, 23.06f, 20.45f)
                curveTo(22.82f, 20.87f, 22.49f, 21.25f, 22.11f, 21.57f)
                curveTo(21.28f, 22.33f, 20.17f, 22.75f, 19f, 22.75f)
                close()
                moveTo(19f, 14.75f)
                curveTo(18.26f, 14.75f, 17.56f, 15f, 16.97f, 15.47f)
                curveTo(16.2f, 16.08f, 15.75f, 17.01f, 15.75f, 18f)
                curveTo(15.75f, 18.59f, 15.91f, 19.17f, 16.22f, 19.67f)
                curveTo(16.81f, 20.67f, 17.85f, 21.25f, 19f, 21.25f)
                curveTo(19.79f, 21.25f, 20.55f, 20.96f, 21.13f, 20.44f)
                curveTo(21.39f, 20.22f, 21.61f, 19.96f, 21.77f, 19.68f)
                curveTo(22.09f, 19.17f, 22.25f, 18.59f, 22.25f, 18f)
                curveTo(22.25f, 16.21f, 20.79f, 14.75f, 19f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.07f, 19.79f)
                curveTo(19.88f, 19.79f, 19.69f, 19.72f, 19.54f, 19.57f)
                lineTo(17.43f, 17.46f)
                curveTo(17.14f, 17.17f, 17.14f, 16.69f, 17.43f, 16.4f)
                curveTo(17.72f, 16.11f, 18.2f, 16.11f, 18.49f, 16.4f)
                lineTo(20.6f, 18.51f)
                curveTo(20.89f, 18.8f, 20.89f, 19.28f, 20.6f, 19.57f)
                curveTo(20.45f, 19.72f, 20.26f, 19.79f, 20.07f, 19.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.931f, 19.82f)
                curveTo(17.741f, 19.82f, 17.551f, 19.75f, 17.401f, 19.6f)
                curveTo(17.111f, 19.31f, 17.111f, 18.83f, 17.401f, 18.54f)
                lineTo(19.511f, 16.43f)
                curveTo(19.801f, 16.14f, 20.281f, 16.14f, 20.571f, 16.43f)
                curveTo(20.861f, 16.72f, 20.861f, 17.2f, 20.571f, 17.49f)
                lineTo(18.461f, 19.6f)
                curveTo(18.311f, 19.75f, 18.121f, 19.82f, 17.931f, 19.82f)
                close()
            }
        }.build()

        return _BoxRemove!!
    }

@Suppress("ObjectPropertyName")
private var _BoxRemove: ImageVector? = null
