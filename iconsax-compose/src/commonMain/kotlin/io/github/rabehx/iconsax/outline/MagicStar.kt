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

val Iconsax.Outline.MagicStar: ImageVector
    get() {
        if (_MagicStar != null) {
            return _MagicStar!!
        }
        _MagicStar = ImageVector.Builder(
            name = "Outline.MagicStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.01f, 22.5f)
                curveTo(12.41f, 22.5f, 11.48f, 22.21f, 10.59f, 20.75f)
                lineTo(8.83f, 17.9f)
                curveTo(8.66f, 17.62f, 8.14f, 17.35f, 7.82f, 17.37f)
                lineTo(4.48f, 17.54f)
                curveTo(2.48f, 17.64f, 1.78f, 16.81f, 1.53f, 16.31f)
                curveTo(1.28f, 15.81f, 1.06f, 14.74f, 2.36f, 13.22f)
                lineTo(4.34f, 10.92f)
                curveTo(4.54f, 10.68f, 4.65f, 10.16f, 4.56f, 9.86f)
                lineTo(3.55f, 6.63f)
                curveTo(3.04f, 5.01f, 3.61f, 4.14f, 3.99f, 3.76f)
                curveTo(4.37f, 3.38f, 5.25f, 2.83f, 6.87f, 3.37f)
                lineTo(9.82f, 4.34f)
                curveTo(10.09f, 4.43f, 10.59f, 4.35f, 10.82f, 4.19f)
                lineTo(13.9f, 1.97f)
                curveTo(15.31f, 0.95f, 16.33f, 1.22f, 16.8f, 1.47f)
                curveTo(17.27f, 1.72f, 18.07f, 2.4f, 18.04f, 4.14f)
                lineTo(17.97f, 7.93f)
                curveTo(17.96f, 8.21f, 18.19f, 8.67f, 18.41f, 8.84f)
                lineTo(20.89f, 10.72f)
                curveTo(22.24f, 11.75f, 22.29f, 12.78f, 22.2f, 13.31f)
                curveTo(22.11f, 13.84f, 21.71f, 14.8f, 20.09f, 15.3f)
                lineTo(16.86f, 16.31f)
                curveTo(16.56f, 16.4f, 16.19f, 16.79f, 16.11f, 17.09f)
                lineTo(15.34f, 20.03f)
                curveTo(14.83f, 21.96f, 13.83f, 22.39f, 13.27f, 22.47f)
                curveTo(13.2f, 22.49f, 13.11f, 22.5f, 13.01f, 22.5f)
                close()
                moveTo(7.85f, 15.87f)
                curveTo(8.71f, 15.87f, 9.66f, 16.39f, 10.1f, 17.11f)
                lineTo(11.86f, 19.96f)
                curveTo(12.36f, 20.78f, 12.81f, 21.03f, 13.05f, 20.99f)
                curveTo(13.28f, 20.96f, 13.64f, 20.58f, 13.89f, 19.66f)
                lineTo(14.66f, 16.72f)
                curveTo(14.87f, 15.92f, 15.62f, 15.13f, 16.41f, 14.89f)
                lineTo(19.64f, 13.88f)
                curveTo(20.26f, 13.69f, 20.66f, 13.38f, 20.72f, 13.06f)
                curveTo(20.78f, 12.74f, 20.5f, 12.32f, 19.98f, 11.92f)
                lineTo(17.5f, 10.04f)
                curveTo(16.89f, 9.58f, 16.45f, 8.66f, 16.46f, 7.9f)
                lineTo(16.53f, 4.11f)
                curveTo(16.54f, 3.44f, 16.38f, 2.94f, 16.09f, 2.79f)
                curveTo(15.8f, 2.64f, 15.31f, 2.79f, 14.76f, 3.18f)
                lineTo(11.68f, 5.4f)
                curveTo(11.07f, 5.84f, 10.06f, 6f, 9.33f, 5.76f)
                lineTo(6.38f, 4.79f)
                curveTo(5.76f, 4.59f, 5.26f, 4.6f, 5.03f, 4.83f)
                curveTo(4.8f, 5.06f, 4.78f, 5.56f, 4.97f, 6.18f)
                lineTo(5.98f, 9.41f)
                curveTo(6.23f, 10.2f, 6.01f, 11.27f, 5.47f, 11.89f)
                lineTo(3.49f, 14.19f)
                curveTo(2.86f, 14.92f, 2.76f, 15.43f, 2.87f, 15.64f)
                curveTo(2.97f, 15.85f, 3.45f, 16.08f, 4.4f, 16.03f)
                lineTo(7.74f, 15.86f)
                curveTo(7.78f, 15.87f, 7.82f, 15.87f, 7.85f, 15.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.91f, 22.75f)
                curveTo(21.72f, 22.75f, 21.53f, 22.68f, 21.38f, 22.53f)
                lineTo(18.35f, 19.5f)
                curveTo(18.06f, 19.21f, 18.06f, 18.73f, 18.35f, 18.44f)
                curveTo(18.64f, 18.15f, 19.12f, 18.15f, 19.41f, 18.44f)
                lineTo(22.44f, 21.47f)
                curveTo(22.73f, 21.76f, 22.73f, 22.24f, 22.44f, 22.53f)
                curveTo(22.29f, 22.68f, 22.1f, 22.75f, 21.91f, 22.75f)
                close()
            }
        }.build()

        return _MagicStar!!
    }

@Suppress("ObjectPropertyName")
private var _MagicStar: ImageVector? = null
