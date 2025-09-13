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

val Iconsax.Outline.CardEdit: ImageVector
    get() {
        if (_CardEdit != null) {
            return _CardEdit!!
        }
        _CardEdit = ImageVector.Builder(
            name = "Outline.CardEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.5f, 9.25f)
                horizontalLineTo(2f)
                curveTo(1.59f, 9.25f, 1.25f, 8.91f, 1.25f, 8.5f)
                curveTo(1.25f, 8.09f, 1.59f, 7.75f, 2f, 7.75f)
                horizontalLineTo(11.5f)
                curveTo(11.91f, 7.75f, 12.25f, 8.09f, 12.25f, 8.5f)
                curveTo(12.25f, 8.91f, 11.91f, 9.25f, 11.5f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 17.25f)
                horizontalLineTo(6f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6f, 15.75f)
                horizontalLineTo(8f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.56f, 21.25f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 21.25f, 1.25f, 20.05f, 1.25f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.25f, 3.95f, 2.46f, 2.75f, 6.44f, 2.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 2.75f, 15.25f, 3.09f, 15.25f, 3.5f)
                curveTo(15.25f, 3.91f, 14.91f, 4.25f, 14.5f, 4.25f)
                horizontalLineTo(6.44f)
                curveTo(3.3f, 4.25f, 2.75f, 4.79f, 2.75f, 7.89f)
                verticalLineTo(16.1f)
                curveTo(2.75f, 19.2f, 3.3f, 19.74f, 6.44f, 19.74f)
                horizontalLineTo(17.55f)
                curveTo(20.69f, 19.74f, 21.24f, 19.2f, 21.24f, 16.1f)
                verticalLineTo(12.02f)
                curveTo(21.24f, 11.61f, 21.58f, 11.27f, 21.99f, 11.27f)
                curveTo(22.4f, 11.27f, 22.74f, 11.61f, 22.74f, 12.02f)
                verticalLineTo(16.1f)
                curveTo(22.75f, 20.05f, 21.54f, 21.25f, 17.56f, 21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.519f, 11.44f)
                curveTo(15.129f, 11.44f, 14.759f, 11.3f, 14.499f, 11.03f)
                curveTo(14.179f, 10.71f, 14.039f, 10.25f, 14.109f, 9.77f)
                lineTo(14.309f, 8.35f)
                curveTo(14.359f, 7.99f, 14.579f, 7.56f, 14.829f, 7.31f)
                lineTo(18.539f, 3.6f)
                curveTo(20.009f, 2.13f, 21.289f, 2.97f, 21.929f, 3.6f)
                curveTo(22.559f, 4.23f, 23.399f, 5.51f, 21.929f, 6.99f)
                lineTo(18.219f, 10.7f)
                curveTo(17.959f, 10.96f, 17.529f, 11.17f, 17.179f, 11.22f)
                lineTo(15.759f, 11.42f)
                curveTo(15.679f, 11.43f, 15.599f, 11.44f, 15.519f, 11.44f)
                close()
                moveTo(20.229f, 4.28f)
                curveTo(20.029f, 4.28f, 19.849f, 4.42f, 19.599f, 4.66f)
                lineTo(15.899f, 8.37f)
                curveTo(15.869f, 8.41f, 15.809f, 8.52f, 15.799f, 8.57f)
                lineTo(15.599f, 9.92f)
                lineTo(16.959f, 9.73f)
                curveTo(17.009f, 9.72f, 17.119f, 9.66f, 17.159f, 9.63f)
                lineTo(20.869f, 5.92f)
                curveTo(21.339f, 5.45f, 21.409f, 5.19f, 20.869f, 4.66f)
                curveTo(20.609f, 4.4f, 20.419f, 4.28f, 20.229f, 4.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.87f, 7.74f)
                curveTo(20.8f, 7.74f, 20.73f, 7.73f, 20.67f, 7.71f)
                curveTo(19.3f, 7.32f, 18.21f, 6.24f, 17.83f, 4.87f)
                curveTo(17.72f, 4.47f, 17.95f, 4.06f, 18.35f, 3.94f)
                curveTo(18.75f, 3.83f, 19.16f, 4.06f, 19.28f, 4.46f)
                curveTo(19.53f, 5.33f, 20.22f, 6.02f, 21.09f, 6.27f)
                curveTo(21.49f, 6.38f, 21.72f, 6.8f, 21.61f, 7.19f)
                curveTo(21.5f, 7.52f, 21.2f, 7.74f, 20.87f, 7.74f)
                close()
            }
        }.build()

        return _CardEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CardEdit: ImageVector? = null
