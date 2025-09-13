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

val Iconsax.Outline.BoxTime: ImageVector
    get() {
        if (_BoxTime != null) {
            return _BoxTime!!
        }
        _BoxTime = ImageVector.Builder(
            name = "Outline.BoxTime",
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
                moveTo(11.999f, 22.75f)
                curveTo(11.119f, 22.75f, 10.239f, 22.56f, 9.559f, 22.17f)
                lineTo(4.219f, 19.21f)
                curveTo(2.769f, 18.41f, 1.629f, 16.48f, 1.629f, 14.82f)
                verticalLineTo(9.16f)
                curveTo(1.629f, 7.5f, 2.769f, 5.58f, 4.219f, 4.77f)
                lineTo(9.559f, 1.81f)
                curveTo(10.919f, 1.05f, 13.059f, 1.05f, 14.429f, 1.81f)
                lineTo(19.769f, 4.77f)
                curveTo(21.219f, 5.57f, 22.359f, 7.5f, 22.359f, 9.16f)
                verticalLineTo(14.82f)
                curveTo(22.359f, 14.89f, 22.359f, 14.99f, 22.329f, 15.12f)
                curveTo(22.269f, 15.38f, 22.079f, 15.59f, 21.829f, 15.67f)
                curveTo(21.579f, 15.75f, 21.299f, 15.7f, 21.099f, 15.52f)
                curveTo(19.959f, 14.52f, 18.179f, 14.48f, 16.959f, 15.45f)
                curveTo(16.189f, 16.06f, 15.739f, 16.99f, 15.739f, 17.98f)
                curveTo(15.739f, 18.57f, 15.899f, 19.15f, 16.209f, 19.65f)
                curveTo(16.289f, 19.79f, 16.369f, 19.9f, 16.459f, 20f)
                curveTo(16.609f, 20.17f, 16.669f, 20.4f, 16.629f, 20.62f)
                curveTo(16.589f, 20.84f, 16.449f, 21.04f, 16.249f, 21.14f)
                lineTo(14.419f, 22.15f)
                curveTo(13.749f, 22.56f, 12.879f, 22.75f, 11.999f, 22.75f)
                close()
                moveTo(11.999f, 2.75f)
                curveTo(11.379f, 2.75f, 10.749f, 2.88f, 10.299f, 3.13f)
                lineTo(4.959f, 6.09f)
                curveTo(3.989f, 6.63f, 3.149f, 8.06f, 3.149f, 9.16f)
                verticalLineTo(14.82f)
                curveTo(3.149f, 15.92f, 3.999f, 17.36f, 4.959f, 17.89f)
                lineTo(10.299f, 20.85f)
                curveTo(11.209f, 21.36f, 12.799f, 21.36f, 13.709f, 20.85f)
                lineTo(14.829f, 20.23f)
                curveTo(14.459f, 19.56f, 14.259f, 18.78f, 14.259f, 17.98f)
                curveTo(14.259f, 16.52f, 14.909f, 15.17f, 16.039f, 14.27f)
                curveTo(17.409f, 13.18f, 19.349f, 12.95f, 20.869f, 13.61f)
                verticalLineTo(9.15f)
                curveTo(20.869f, 8.05f, 20.019f, 6.61f, 19.059f, 6.08f)
                lineTo(13.719f, 3.12f)
                curveTo(13.249f, 2.88f, 12.619f, 2.75f, 11.999f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 22.75f)
                curveTo(16.38f, 22.75f, 14.25f, 20.62f, 14.25f, 18f)
                curveTo(14.25f, 16.54f, 14.9f, 15.19f, 16.03f, 14.29f)
                curveTo(16.87f, 13.62f, 17.93f, 13.25f, 19f, 13.25f)
                curveTo(21.62f, 13.25f, 23.75f, 15.38f, 23.75f, 18f)
                curveTo(23.75f, 19.36f, 23.16f, 20.66f, 22.13f, 21.56f)
                curveTo(21.26f, 22.33f, 20.15f, 22.75f, 19f, 22.75f)
                close()
                moveTo(19f, 14.75f)
                curveTo(18.26f, 14.75f, 17.56f, 15f, 16.97f, 15.47f)
                curveTo(16.2f, 16.08f, 15.75f, 17.01f, 15.75f, 18f)
                curveTo(15.75f, 19.79f, 17.21f, 21.25f, 19f, 21.25f)
                curveTo(19.78f, 21.25f, 20.54f, 20.96f, 21.15f, 20.44f)
                curveTo(21.85f, 19.82f, 22.25f, 18.94f, 22.25f, 18f)
                curveTo(22.25f, 16.21f, 20.79f, 14.75f, 19f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 19.75f)
                curveTo(17.75f, 19.75f, 17.5f, 19.62f, 17.36f, 19.39f)
                curveTo(17.15f, 19.03f, 17.26f, 18.57f, 17.62f, 18.36f)
                lineTo(18.51f, 17.83f)
                verticalLineTo(16.75f)
                curveTo(18.51f, 16.34f, 18.85f, 16f, 19.26f, 16f)
                curveTo(19.67f, 16f, 20.01f, 16.34f, 20.01f, 16.75f)
                verticalLineTo(18.25f)
                curveTo(20.01f, 18.51f, 19.87f, 18.76f, 19.65f, 18.89f)
                lineTo(18.4f, 19.64f)
                curveTo(18.26f, 19.72f, 18.13f, 19.75f, 18f, 19.75f)
                close()
            }
        }.build()

        return _BoxTime!!
    }

@Suppress("ObjectPropertyName")
private var _BoxTime: ImageVector? = null
