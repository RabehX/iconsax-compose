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

val Iconsax.Outline.Filter: ImageVector
    get() {
        if (_Filter != null) {
            return _Filter!!
        }
        _Filter = ImageVector.Builder(
            name = "Outline.Filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.94f, 22.65f)
                curveTo(10.46f, 22.65f, 9.99f, 22.53f, 9.55f, 22.29f)
                curveTo(8.67f, 21.8f, 8.14f, 20.91f, 8.14f, 19.91f)
                verticalLineTo(14.61f)
                curveTo(8.14f, 14.11f, 7.81f, 13.36f, 7.5f, 12.98f)
                lineTo(3.76f, 9.02f)
                curveTo(3.13f, 8.39f, 2.65f, 7.31f, 2.65f, 6.5f)
                verticalLineTo(4.2f)
                curveTo(2.65f, 2.6f, 3.86f, 1.35f, 5.4f, 1.35f)
                horizontalLineTo(18.6f)
                curveTo(20.12f, 1.35f, 21.35f, 2.58f, 21.35f, 4.1f)
                verticalLineTo(6.3f)
                curveTo(21.35f, 7.35f, 20.72f, 8.54f, 20.13f, 9.13f)
                lineTo(15.8f, 12.96f)
                curveTo(15.38f, 13.31f, 15.05f, 14.08f, 15.05f, 14.7f)
                verticalLineTo(19f)
                curveTo(15.05f, 19.89f, 14.49f, 20.92f, 13.79f, 21.34f)
                lineTo(12.41f, 22.23f)
                curveTo(11.96f, 22.51f, 11.45f, 22.65f, 10.94f, 22.65f)
                close()
                moveTo(5.4f, 2.85f)
                curveTo(4.7f, 2.85f, 4.15f, 3.44f, 4.15f, 4.2f)
                verticalLineTo(6.5f)
                curveTo(4.15f, 6.87f, 4.45f, 7.59f, 4.83f, 7.97f)
                lineTo(8.64f, 11.98f)
                curveTo(9.15f, 12.61f, 9.65f, 13.66f, 9.65f, 14.6f)
                verticalLineTo(19.9f)
                curveTo(9.65f, 20.55f, 10.1f, 20.87f, 10.29f, 20.97f)
                curveTo(10.71f, 21.2f, 11.22f, 21.2f, 11.61f, 20.96f)
                lineTo(13f, 20.07f)
                curveTo(13.28f, 19.9f, 13.56f, 19.36f, 13.56f, 19f)
                verticalLineTo(14.7f)
                curveTo(13.56f, 13.63f, 14.08f, 12.45f, 14.83f, 11.82f)
                lineTo(19.11f, 8.03f)
                curveTo(19.45f, 7.69f, 19.86f, 6.88f, 19.86f, 6.29f)
                verticalLineTo(4.1f)
                curveTo(19.86f, 3.41f, 19.3f, 2.85f, 18.61f, 2.85f)
                horizontalLineTo(5.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 10.75f)
                curveTo(5.86f, 10.75f, 5.73f, 10.71f, 5.6f, 10.64f)
                curveTo(5.25f, 10.42f, 5.14f, 9.95f, 5.36f, 9.6f)
                lineTo(10.29f, 1.7f)
                curveTo(10.51f, 1.35f, 10.97f, 1.24f, 11.32f, 1.46f)
                curveTo(11.67f, 1.68f, 11.78f, 2.14f, 11.56f, 2.49f)
                lineTo(6.63f, 10.39f)
                curveTo(6.49f, 10.62f, 6.25f, 10.75f, 6f, 10.75f)
                close()
            }
        }.build()

        return _Filter!!
    }

@Suppress("ObjectPropertyName")
private var _Filter: ImageVector? = null
