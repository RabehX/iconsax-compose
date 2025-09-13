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

val Iconsax.Outline.People: ImageVector
    get() {
        if (_People != null) {
            return _People!!
        }
        _People = ImageVector.Builder(
            name = "Outline.People",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 7.91f)
                curveTo(17.97f, 7.91f, 17.95f, 7.91f, 17.92f, 7.91f)
                horizontalLineTo(17.87f)
                curveTo(15.98f, 7.85f, 14.57f, 6.39f, 14.57f, 4.59f)
                curveTo(14.57f, 2.75f, 16.07f, 1.26f, 17.9f, 1.26f)
                curveTo(19.73f, 1.26f, 21.23f, 2.76f, 21.23f, 4.59f)
                curveTo(21.22f, 6.4f, 19.81f, 7.86f, 18.01f, 7.92f)
                curveTo(18.01f, 7.91f, 18.01f, 7.91f, 18f, 7.91f)
                close()
                moveTo(17.9f, 2.75f)
                curveTo(16.89f, 2.75f, 16.07f, 3.57f, 16.07f, 4.58f)
                curveTo(16.07f, 5.57f, 16.84f, 6.37f, 17.83f, 6.41f)
                curveTo(17.84f, 6.4f, 17.92f, 6.4f, 18.01f, 6.41f)
                curveTo(18.98f, 6.36f, 19.73f, 5.56f, 19.74f, 4.58f)
                curveTo(19.74f, 3.57f, 18.92f, 2.75f, 17.9f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.01f, 15.28f)
                curveTo(17.621f, 15.28f, 17.23f, 15.25f, 16.84f, 15.18f)
                curveTo(16.431f, 15.11f, 16.16f, 14.72f, 16.23f, 14.31f)
                curveTo(16.301f, 13.9f, 16.691f, 13.63f, 17.101f, 13.7f)
                curveTo(18.33f, 13.91f, 19.631f, 13.68f, 20.5f, 13.1f)
                curveTo(20.971f, 12.79f, 21.221f, 12.4f, 21.221f, 12.01f)
                curveTo(21.221f, 11.62f, 20.961f, 11.24f, 20.5f, 10.93f)
                curveTo(19.631f, 10.35f, 18.31f, 10.12f, 17.07f, 10.34f)
                curveTo(16.66f, 10.42f, 16.271f, 10.14f, 16.201f, 9.73f)
                curveTo(16.131f, 9.32f, 16.4f, 8.93f, 16.81f, 8.86f)
                curveTo(18.441f, 8.57f, 20.131f, 8.88f, 21.33f, 9.68f)
                curveTo(22.211f, 10.27f, 22.721f, 11.11f, 22.721f, 12.01f)
                curveTo(22.721f, 12.9f, 22.221f, 13.75f, 21.33f, 14.35f)
                curveTo(20.42f, 14.95f, 19.24f, 15.28f, 18.01f, 15.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.97f, 7.91f)
                curveTo(5.96f, 7.91f, 5.95f, 7.91f, 5.95f, 7.91f)
                curveTo(4.15f, 7.85f, 2.74f, 6.39f, 2.73f, 4.59f)
                curveTo(2.73f, 2.75f, 4.23f, 1.25f, 6.06f, 1.25f)
                curveTo(7.89f, 1.25f, 9.39f, 2.75f, 9.39f, 4.58f)
                curveTo(9.39f, 6.39f, 7.98f, 7.85f, 6.18f, 7.91f)
                lineTo(5.97f, 7.16f)
                lineTo(6.04f, 7.91f)
                curveTo(6.02f, 7.91f, 5.99f, 7.91f, 5.97f, 7.91f)
                close()
                moveTo(6.07f, 6.41f)
                curveTo(6.13f, 6.41f, 6.18f, 6.41f, 6.24f, 6.42f)
                curveTo(7.13f, 6.38f, 7.91f, 5.58f, 7.91f, 4.59f)
                curveTo(7.91f, 3.58f, 7.09f, 2.76f, 6.08f, 2.76f)
                curveTo(5.07f, 2.76f, 4.25f, 3.58f, 4.25f, 4.59f)
                curveTo(4.25f, 5.57f, 5.01f, 6.36f, 5.98f, 6.42f)
                curveTo(5.99f, 6.41f, 6.03f, 6.41f, 6.07f, 6.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.96f, 15.28f)
                curveTo(4.73f, 15.28f, 3.55f, 14.95f, 2.64f, 14.35f)
                curveTo(1.76f, 13.76f, 1.25f, 12.91f, 1.25f, 12.01f)
                curveTo(1.25f, 11.12f, 1.76f, 10.27f, 2.64f, 9.68f)
                curveTo(3.84f, 8.88f, 5.53f, 8.57f, 7.16f, 8.86f)
                curveTo(7.57f, 8.93f, 7.84f, 9.32f, 7.77f, 9.73f)
                curveTo(7.7f, 10.14f, 7.31f, 10.42f, 6.9f, 10.34f)
                curveTo(5.66f, 10.12f, 4.35f, 10.35f, 3.47f, 10.93f)
                curveTo(3f, 11.24f, 2.75f, 11.62f, 2.75f, 12.01f)
                curveTo(2.75f, 12.4f, 3.01f, 12.79f, 3.47f, 13.1f)
                curveTo(4.34f, 13.68f, 5.64f, 13.91f, 6.87f, 13.7f)
                curveTo(7.28f, 13.63f, 7.67f, 13.91f, 7.74f, 14.31f)
                curveTo(7.81f, 14.72f, 7.54f, 15.11f, 7.13f, 15.18f)
                curveTo(6.74f, 15.25f, 6.35f, 15.28f, 5.96f, 15.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.38f)
                curveTo(11.97f, 15.38f, 11.95f, 15.38f, 11.92f, 15.38f)
                horizontalLineTo(11.87f)
                curveTo(9.98f, 15.32f, 8.57f, 13.86f, 8.57f, 12.06f)
                curveTo(8.57f, 10.22f, 10.07f, 8.73f, 11.9f, 8.73f)
                curveTo(13.73f, 8.73f, 15.23f, 10.23f, 15.23f, 12.06f)
                curveTo(15.22f, 13.87f, 13.81f, 15.33f, 12.01f, 15.39f)
                curveTo(12.01f, 15.38f, 12.01f, 15.38f, 12f, 15.38f)
                close()
                moveTo(11.9f, 10.22f)
                curveTo(10.89f, 10.22f, 10.07f, 11.04f, 10.07f, 12.05f)
                curveTo(10.07f, 13.04f, 10.84f, 13.84f, 11.83f, 13.88f)
                curveTo(11.84f, 13.87f, 11.92f, 13.87f, 12.01f, 13.88f)
                curveTo(12.98f, 13.83f, 13.73f, 13.03f, 13.74f, 12.05f)
                curveTo(13.74f, 11.05f, 12.92f, 10.22f, 11.9f, 10.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 22.76f)
                curveTo(10.799f, 22.76f, 9.599f, 22.45f, 8.669f, 21.82f)
                curveTo(7.789f, 21.23f, 7.279f, 20.39f, 7.279f, 19.49f)
                curveTo(7.279f, 18.6f, 7.779f, 17.74f, 8.669f, 17.15f)
                curveTo(10.539f, 15.91f, 13.469f, 15.91f, 15.329f, 17.15f)
                curveTo(16.209f, 17.74f, 16.719f, 18.58f, 16.719f, 19.48f)
                curveTo(16.719f, 20.37f, 16.219f, 21.23f, 15.329f, 21.82f)
                curveTo(14.399f, 22.44f, 13.199f, 22.76f, 11.999f, 22.76f)
                close()
                moveTo(9.499f, 18.41f)
                curveTo(9.029f, 18.72f, 8.779f, 19.11f, 8.779f, 19.5f)
                curveTo(8.779f, 19.89f, 9.039f, 20.27f, 9.499f, 20.58f)
                curveTo(10.849f, 21.49f, 13.139f, 21.49f, 14.489f, 20.58f)
                curveTo(14.959f, 20.27f, 15.209f, 19.88f, 15.209f, 19.49f)
                curveTo(15.209f, 19.1f, 14.949f, 18.72f, 14.489f, 18.41f)
                curveTo(13.149f, 17.5f, 10.859f, 17.51f, 9.499f, 18.41f)
                close()
            }
        }.build()

        return _People!!
    }

@Suppress("ObjectPropertyName")
private var _People: ImageVector? = null
