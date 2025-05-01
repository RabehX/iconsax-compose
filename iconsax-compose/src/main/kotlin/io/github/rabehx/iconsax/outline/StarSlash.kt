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

val Iconsax.Outline.StarSlash: ImageVector
    get() {
        if (_StarSlash != null) {
            return _StarSlash!!
        }
        _StarSlash = ImageVector.Builder(
            name = "Outline.StarSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.28f, 19.4f)
                curveTo(5.22f, 19.4f, 5.17f, 19.39f, 5.11f, 19.38f)
                curveTo(4.71f, 19.29f, 4.45f, 18.88f, 4.55f, 18.48f)
                lineTo(5.12f, 16.02f)
                curveTo(5.2f, 15.7f, 5.04f, 15.15f, 4.8f, 14.91f)
                lineTo(2.32f, 12.43f)
                curveTo(1.08f, 11.19f, 1.18f, 10.13f, 1.35f, 9.61f)
                curveTo(1.52f, 9.09f, 2.06f, 8.17f, 3.78f, 7.88f)
                lineTo(6.97f, 7.35f)
                curveTo(7.27f, 7.29f, 7.7f, 6.97f, 7.83f, 6.7f)
                lineTo(9.6f, 3.17f)
                curveTo(10.4f, 1.56f, 11.45f, 1.33f, 12f, 1.33f)
                curveTo(12.55f, 1.33f, 13.6f, 1.57f, 14.4f, 3.17f)
                lineTo(16.16f, 6.69f)
                curveTo(16.22f, 6.81f, 16.35f, 6.95f, 16.5f, 7.07f)
                curveTo(16.83f, 7.32f, 16.89f, 7.8f, 16.63f, 8.12f)
                curveTo(16.38f, 8.45f, 15.91f, 8.51f, 15.58f, 8.25f)
                curveTo(15.34f, 8.07f, 15.02f, 7.76f, 14.82f, 7.36f)
                lineTo(13.06f, 3.84f)
                curveTo(12.75f, 3.21f, 12.35f, 2.83f, 12f, 2.83f)
                curveTo(11.65f, 2.83f, 11.25f, 3.21f, 10.94f, 3.85f)
                lineTo(9.17f, 7.37f)
                curveTo(8.82f, 8.07f, 7.98f, 8.69f, 7.21f, 8.82f)
                lineTo(4.03f, 9.35f)
                curveTo(3.35f, 9.46f, 2.89f, 9.73f, 2.78f, 10.06f)
                curveTo(2.67f, 10.39f, 2.9f, 10.88f, 3.39f, 11.36f)
                lineTo(5.87f, 13.84f)
                curveTo(6.47f, 14.44f, 6.78f, 15.52f, 6.59f, 16.35f)
                lineTo(6.02f, 18.81f)
                curveTo(5.93f, 19.16f, 5.63f, 19.4f, 5.28f, 19.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.659f, 22.67f)
                curveTo(17.129f, 22.67f, 16.449f, 22.5f, 15.599f, 22f)
                lineTo(12.609f, 20.23f)
                curveTo(12.299f, 20.05f, 11.699f, 20.05f, 11.399f, 20.23f)
                lineTo(8.399f, 22f)
                curveTo(8.049f, 22.21f, 7.579f, 22.09f, 7.369f, 21.74f)
                curveTo(7.159f, 21.38f, 7.279f, 20.92f, 7.629f, 20.71f)
                lineTo(10.619f, 18.94f)
                curveTo(11.399f, 18.48f, 12.579f, 18.48f, 13.359f, 18.94f)
                lineTo(16.349f, 20.71f)
                curveTo(17.219f, 21.23f, 17.769f, 21.23f, 17.979f, 21.08f)
                curveTo(18.189f, 20.93f, 18.339f, 20.4f, 18.119f, 19.42f)
                lineTo(17.409f, 16.35f)
                curveTo(17.219f, 15.52f, 17.529f, 14.45f, 18.129f, 13.84f)
                lineTo(20.609f, 11.36f)
                curveTo(21.099f, 10.87f, 21.319f, 10.39f, 21.219f, 10.06f)
                curveTo(21.109f, 9.73f, 20.649f, 9.46f, 19.969f, 9.35f)
                curveTo(19.559f, 9.28f, 19.289f, 8.9f, 19.349f, 8.49f)
                curveTo(19.419f, 8.08f, 19.799f, 7.81f, 20.209f, 7.87f)
                curveTo(21.939f, 8.16f, 22.479f, 9.08f, 22.639f, 9.6f)
                curveTo(22.799f, 10.12f, 22.899f, 11.18f, 21.669f, 12.42f)
                lineTo(19.199f, 14.9f)
                curveTo(18.959f, 15.14f, 18.809f, 15.68f, 18.879f, 16.01f)
                lineTo(19.589f, 19.08f)
                curveTo(20.049f, 21.08f, 19.339f, 21.95f, 18.879f, 22.29f)
                curveTo(18.629f, 22.47f, 18.229f, 22.67f, 17.659f, 22.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.999f, 22.75f)
                curveTo(1.809f, 22.75f, 1.619f, 22.68f, 1.469f, 22.53f)
                curveTo(1.179f, 22.24f, 1.179f, 21.76f, 1.469f, 21.47f)
                lineTo(21.469f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.529f, 1.47f)
                curveTo(22.819f, 1.76f, 22.819f, 2.24f, 22.529f, 2.53f)
                lineTo(2.529f, 22.53f)
                curveTo(2.379f, 22.68f, 2.189f, 22.75f, 1.999f, 22.75f)
                close()
            }
        }.build()

        return _StarSlash!!
    }

@Suppress("ObjectPropertyName")
private var _StarSlash: ImageVector? = null
