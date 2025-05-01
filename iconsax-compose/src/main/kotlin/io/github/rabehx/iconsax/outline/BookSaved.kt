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

val Iconsax.Outline.BookSaved: ImageVector
    get() {
        if (_BookSaved != null) {
            return _BookSaved!!
        }
        _BookSaved = ImageVector.Builder(
            name = "Outline.BookSaved",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.08f)
                curveTo(11.7f, 22.08f, 11.4f, 22.01f, 11.15f, 21.87f)
                curveTo(9.28f, 20.85f, 6f, 19.77f, 3.94f, 19.5f)
                lineTo(3.65f, 19.46f)
                curveTo(2.34f, 19.3f, 1.26f, 18.07f, 1.26f, 16.74f)
                verticalLineTo(4.66f)
                curveTo(1.26f, 3.87f, 1.57f, 3.15f, 2.14f, 2.63f)
                curveTo(2.71f, 2.11f, 3.45f, 1.86f, 4.23f, 1.93f)
                curveTo(6.42f, 2.11f, 9.74f, 3.21f, 11.62f, 4.38f)
                lineTo(11.86f, 4.52f)
                curveTo(11.93f, 4.55f, 12.08f, 4.56f, 12.14f, 4.52f)
                lineTo(12.3f, 4.42f)
                curveTo(12.97f, 4f, 13.81f, 3.59f, 14.73f, 3.22f)
                curveTo(14.96f, 3.13f, 15.22f, 3.16f, 15.43f, 3.3f)
                curveTo(15.64f, 3.44f, 15.76f, 3.67f, 15.76f, 3.92f)
                verticalLineTo(6.6f)
                lineTo(16.59f, 6.05f)
                curveTo(16.84f, 5.88f, 17.17f, 5.88f, 17.42f, 6.05f)
                lineTo(18.25f, 6.6f)
                verticalLineTo(2.78f)
                curveTo(18.25f, 2.42f, 18.51f, 2.11f, 18.86f, 2.04f)
                curveTo(19.15f, 1.99f, 19.44f, 1.95f, 19.7f, 1.93f)
                curveTo(19.72f, 1.93f, 19.8f, 1.93f, 19.82f, 1.93f)
                curveTo(20.55f, 1.87f, 21.3f, 2.12f, 21.86f, 2.64f)
                curveTo(22.43f, 3.16f, 22.74f, 3.88f, 22.74f, 4.67f)
                verticalLineTo(16.74f)
                curveTo(22.74f, 18.08f, 21.66f, 19.3f, 20.34f, 19.46f)
                lineTo(20.01f, 19.5f)
                curveTo(17.95f, 19.77f, 14.65f, 20.86f, 12.82f, 21.87f)
                curveTo(12.6f, 22.01f, 12.3f, 22.08f, 12f, 22.08f)
                close()
                moveTo(3.98f, 3.41f)
                curveTo(3.66f, 3.41f, 3.37f, 3.52f, 3.14f, 3.73f)
                curveTo(2.89f, 3.96f, 2.75f, 4.29f, 2.75f, 4.66f)
                verticalLineTo(16.74f)
                curveTo(2.75f, 17.33f, 3.26f, 17.9f, 3.83f, 17.98f)
                lineTo(4.13f, 18.02f)
                curveTo(6.38f, 18.32f, 9.83f, 19.45f, 11.83f, 20.55f)
                curveTo(11.92f, 20.59f, 12.05f, 20.6f, 12.1f, 20.58f)
                curveTo(14.11f, 19.47f, 17.57f, 18.33f, 19.83f, 18.03f)
                lineTo(20.17f, 17.99f)
                curveTo(20.74f, 17.92f, 21.25f, 17.34f, 21.25f, 16.75f)
                verticalLineTo(4.68f)
                curveTo(21.25f, 4.31f, 21.11f, 3.99f, 20.86f, 3.75f)
                curveTo(20.61f, 3.52f, 20.26f, 3.41f, 19.9f, 3.43f)
                curveTo(19.87f, 3.43f, 19.78f, 3.43f, 19.76f, 3.43f)
                verticalLineTo(8f)
                curveTo(19.76f, 8.28f, 19.61f, 8.53f, 19.36f, 8.66f)
                curveTo(19.11f, 8.79f, 18.82f, 8.78f, 18.59f, 8.62f)
                lineTo(17.01f, 7.57f)
                lineTo(15.43f, 8.62f)
                curveTo(15.2f, 8.77f, 14.91f, 8.79f, 14.66f, 8.66f)
                curveTo(14.42f, 8.53f, 14.26f, 8.28f, 14.26f, 8f)
                verticalLineTo(5.07f)
                curveTo(13.83f, 5.28f, 13.44f, 5.49f, 13.1f, 5.69f)
                lineTo(12.94f, 5.79f)
                curveTo(12.39f, 6.13f, 11.61f, 6.13f, 11.08f, 5.8f)
                lineTo(10.84f, 5.65f)
                curveTo(9.15f, 4.59f, 6.07f, 3.57f, 4.11f, 3.41f)
                curveTo(4.06f, 3.41f, 4.02f, 3.41f, 3.98f, 3.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.24f)
                curveTo(11.59f, 21.24f, 11.25f, 20.9f, 11.25f, 20.49f)
                verticalLineTo(5.49f)
                curveTo(11.25f, 5.08f, 11.59f, 4.74f, 12f, 4.74f)
                curveTo(12.41f, 4.74f, 12.75f, 5.08f, 12.75f, 5.49f)
                verticalLineTo(20.49f)
                curveTo(12.75f, 20.91f, 12.41f, 21.24f, 12f, 21.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 8.75f)
                curveTo(18.85f, 8.75f, 18.71f, 8.71f, 18.58f, 8.62f)
                lineTo(17f, 7.57f)
                lineTo(15.42f, 8.62f)
                curveTo(15.19f, 8.77f, 14.9f, 8.79f, 14.65f, 8.66f)
                curveTo(14.41f, 8.53f, 14.25f, 8.28f, 14.25f, 8f)
                verticalLineTo(3.92f)
                curveTo(14.25f, 3.61f, 14.44f, 3.34f, 14.72f, 3.22f)
                curveTo(16.1f, 2.67f, 17.61f, 2.24f, 18.88f, 2.04f)
                curveTo(19.1f, 2f, 19.32f, 2.07f, 19.49f, 2.21f)
                curveTo(19.66f, 2.35f, 19.75f, 2.56f, 19.75f, 2.78f)
                verticalLineTo(8f)
                curveTo(19.75f, 8.28f, 19.6f, 8.53f, 19.35f, 8.66f)
                curveTo(19.24f, 8.72f, 19.12f, 8.75f, 19f, 8.75f)
                close()
                moveTo(17f, 5.92f)
                curveTo(17.14f, 5.92f, 17.29f, 5.96f, 17.42f, 6.05f)
                lineTo(18.25f, 6.6f)
                verticalLineTo(3.69f)
                curveTo(17.45f, 3.87f, 16.58f, 4.13f, 15.75f, 4.44f)
                verticalLineTo(6.6f)
                lineTo(16.58f, 6.05f)
                curveTo(16.71f, 5.96f, 16.86f, 5.92f, 17f, 5.92f)
                close()
            }
        }.build()

        return _BookSaved!!
    }

@Suppress("ObjectPropertyName")
private var _BookSaved: ImageVector? = null
