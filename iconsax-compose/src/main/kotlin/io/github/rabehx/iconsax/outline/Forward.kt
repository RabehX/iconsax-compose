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

val Iconsax.Outline.Forward: ImageVector
    get() {
        if (_Forward != null) {
            return _Forward!!
        }
        _Forward = ImageVector.Builder(
            name = "Outline.Forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.95f, 18.36f)
                curveTo(3.49f, 18.36f, 3.02f, 18.24f, 2.6f, 17.99f)
                curveTo(1.75f, 17.5f, 1.25f, 16.63f, 1.25f, 15.65f)
                verticalLineTo(8.33f)
                curveTo(1.25f, 7.35f, 1.75f, 6.48f, 2.6f, 5.99f)
                curveTo(3.45f, 5.5f, 4.46f, 5.5f, 5.3f, 5.99f)
                lineTo(11.64f, 9.65f)
                curveTo(11.93f, 9.82f, 12.16f, 10.02f, 12.34f, 10.24f)
                curveTo(12.45f, 10.37f, 12.51f, 10.54f, 12.51f, 10.71f)
                verticalLineTo(13.27f)
                curveTo(12.51f, 13.44f, 12.45f, 13.61f, 12.34f, 13.74f)
                curveTo(12.16f, 13.96f, 11.93f, 14.16f, 11.66f, 14.32f)
                lineTo(5.3f, 18f)
                curveTo(4.88f, 18.24f, 4.42f, 18.36f, 3.95f, 18.36f)
                close()
                moveTo(3.95f, 7.14f)
                curveTo(3.74f, 7.14f, 3.54f, 7.19f, 3.35f, 7.3f)
                curveTo(2.97f, 7.52f, 2.75f, 7.91f, 2.75f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(2.75f, 16.09f, 2.97f, 16.48f, 3.35f, 16.7f)
                curveTo(3.73f, 16.92f, 4.17f, 16.92f, 4.55f, 16.7f)
                lineTo(10.89f, 13.04f)
                curveTo(10.93f, 13.02f, 10.97f, 12.99f, 11f, 12.96f)
                verticalLineTo(11.03f)
                curveTo(10.96f, 11f, 10.92f, 10.97f, 10.88f, 10.95f)
                lineTo(4.55f, 7.3f)
                curveTo(4.36f, 7.19f, 4.16f, 7.14f, 3.95f, 7.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.71f, 18.36f)
                curveTo(13.25f, 18.36f, 12.78f, 18.24f, 12.36f, 17.99f)
                curveTo(11.51f, 17.5f, 11.01f, 16.63f, 11.01f, 15.65f)
                verticalLineTo(8.33f)
                curveTo(11.01f, 7.35f, 11.51f, 6.48f, 12.36f, 5.99f)
                curveTo(13.21f, 5.5f, 14.22f, 5.5f, 15.06f, 5.99f)
                lineTo(21.4f, 9.65f)
                curveTo(22.24f, 10.14f, 22.75f, 11.01f, 22.75f, 11.99f)
                curveTo(22.75f, 12.97f, 22.25f, 13.84f, 21.4f, 14.33f)
                lineTo(15.06f, 17.99f)
                curveTo(14.64f, 18.24f, 14.17f, 18.36f, 13.71f, 18.36f)
                close()
                moveTo(13.71f, 7.14f)
                curveTo(13.5f, 7.14f, 13.3f, 7.19f, 13.11f, 7.3f)
                curveTo(12.73f, 7.52f, 12.51f, 7.9f, 12.51f, 8.34f)
                verticalLineTo(15.66f)
                curveTo(12.51f, 16.09f, 12.73f, 16.48f, 13.11f, 16.7f)
                curveTo(13.49f, 16.92f, 13.94f, 16.92f, 14.31f, 16.7f)
                lineTo(20.65f, 13.04f)
                curveTo(21.03f, 12.82f, 21.25f, 12.43f, 21.25f, 12f)
                curveTo(21.25f, 11.57f, 21.03f, 11.18f, 20.65f, 10.96f)
                lineTo(14.31f, 7.3f)
                curveTo(14.12f, 7.19f, 13.92f, 7.14f, 13.71f, 7.14f)
                close()
            }
        }.build()

        return _Forward!!
    }

@Suppress("ObjectPropertyName")
private var _Forward: ImageVector? = null
