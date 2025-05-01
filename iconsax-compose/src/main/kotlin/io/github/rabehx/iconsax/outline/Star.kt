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

val Iconsax.Outline.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Outline.Star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.66f, 22.67f)
                curveTo(17.13f, 22.67f, 16.45f, 22.5f, 15.6f, 22f)
                lineTo(12.61f, 20.23f)
                curveTo(12.3f, 20.05f, 11.7f, 20.05f, 11.4f, 20.23f)
                lineTo(8.4f, 22f)
                curveTo(6.63f, 23.05f, 5.59f, 22.63f, 5.12f, 22.29f)
                curveTo(4.66f, 21.95f, 3.94f, 21.08f, 4.41f, 19.08f)
                lineTo(5.12f, 16.01f)
                curveTo(5.2f, 15.69f, 5.04f, 15.14f, 4.8f, 14.9f)
                lineTo(2.32f, 12.42f)
                curveTo(1.08f, 11.18f, 1.18f, 10.12f, 1.35f, 9.6f)
                curveTo(1.52f, 9.08f, 2.06f, 8.16f, 3.78f, 7.87f)
                lineTo(6.97f, 7.34f)
                curveTo(7.27f, 7.29f, 7.7f, 6.97f, 7.83f, 6.7f)
                lineTo(9.6f, 3.17f)
                curveTo(10.4f, 1.56f, 11.45f, 1.32f, 12f, 1.32f)
                curveTo(12.55f, 1.32f, 13.6f, 1.56f, 14.4f, 3.17f)
                lineTo(16.16f, 6.69f)
                curveTo(16.3f, 6.96f, 16.73f, 7.28f, 17.03f, 7.33f)
                lineTo(20.22f, 7.86f)
                curveTo(21.95f, 8.15f, 22.49f, 9.07f, 22.65f, 9.59f)
                curveTo(22.81f, 10.11f, 22.91f, 11.17f, 21.68f, 12.41f)
                lineTo(19.2f, 14.9f)
                curveTo(18.96f, 15.14f, 18.81f, 15.68f, 18.88f, 16.01f)
                lineTo(19.59f, 19.08f)
                curveTo(20.05f, 21.08f, 19.34f, 21.95f, 18.88f, 22.29f)
                curveTo(18.63f, 22.47f, 18.23f, 22.67f, 17.66f, 22.67f)
                close()
                moveTo(12f, 18.59f)
                curveTo(12.49f, 18.59f, 12.98f, 18.71f, 13.37f, 18.94f)
                lineTo(16.36f, 20.71f)
                curveTo(17.23f, 21.23f, 17.78f, 21.23f, 17.99f, 21.08f)
                curveTo(18.2f, 20.93f, 18.35f, 20.4f, 18.13f, 19.42f)
                lineTo(17.42f, 16.35f)
                curveTo(17.23f, 15.52f, 17.54f, 14.45f, 18.14f, 13.84f)
                lineTo(20.62f, 11.36f)
                curveTo(21.11f, 10.87f, 21.33f, 10.39f, 21.23f, 10.06f)
                curveTo(21.12f, 9.73f, 20.66f, 9.46f, 19.98f, 9.35f)
                lineTo(16.79f, 8.82f)
                curveTo(16.02f, 8.69f, 15.18f, 8.07f, 14.83f, 7.37f)
                lineTo(13.07f, 3.85f)
                curveTo(12.75f, 3.21f, 12.35f, 2.83f, 12f, 2.83f)
                curveTo(11.65f, 2.83f, 11.25f, 3.21f, 10.94f, 3.85f)
                lineTo(9.17f, 7.37f)
                curveTo(8.82f, 8.07f, 7.98f, 8.69f, 7.21f, 8.82f)
                lineTo(4.03f, 9.35f)
                curveTo(3.35f, 9.46f, 2.89f, 9.73f, 2.78f, 10.06f)
                curveTo(2.67f, 10.39f, 2.9f, 10.88f, 3.39f, 11.36f)
                lineTo(5.87f, 13.84f)
                curveTo(6.47f, 14.44f, 6.78f, 15.52f, 6.59f, 16.35f)
                lineTo(5.88f, 19.42f)
                curveTo(5.65f, 20.41f, 5.81f, 20.93f, 6.02f, 21.08f)
                curveTo(6.23f, 21.23f, 6.77f, 21.22f, 7.65f, 20.71f)
                lineTo(10.64f, 18.94f)
                curveTo(11.02f, 18.71f, 11.51f, 18.59f, 12f, 18.59f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
