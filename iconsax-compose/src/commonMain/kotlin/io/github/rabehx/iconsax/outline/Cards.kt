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

val Iconsax.Outline.Cards: ImageVector
    get() {
        if (_Cards != null) {
            return _Cards!!
        }
        _Cards = ImageVector.Builder(
            name = "Outline.Cards",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 13.36f)
                horizontalLineTo(2f)
                curveTo(1.59f, 13.36f, 1.25f, 13.02f, 1.25f, 12.61f)
                curveTo(1.25f, 12.2f, 1.59f, 11.86f, 2f, 11.86f)
                horizontalLineTo(19f)
                curveTo(19.41f, 11.86f, 19.75f, 12.2f, 19.75f, 12.61f)
                curveTo(19.75f, 13.02f, 19.41f, 13.36f, 19f, 13.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.22f, 21.75f)
                horizontalLineTo(5.78f)
                curveTo(2.35f, 21.75f, 1.25f, 20.66f, 1.25f, 17.27f)
                verticalLineTo(10.28f)
                curveTo(1.25f, 7.59f, 1.86f, 6f, 4.96f, 5.82f)
                curveTo(5.22f, 5.81f, 5.49f, 5.8f, 5.78f, 5.8f)
                horizontalLineTo(15.22f)
                curveTo(18.65f, 5.8f, 19.75f, 6.89f, 19.75f, 10.28f)
                verticalLineTo(17.43f)
                curveTo(19.71f, 20.7f, 18.61f, 21.75f, 15.22f, 21.75f)
                close()
                moveTo(5.78f, 7.3f)
                curveTo(5.51f, 7.3f, 5.26f, 7.31f, 5.03f, 7.32f)
                curveTo(3.24f, 7.43f, 2.75f, 7.81f, 2.75f, 10.28f)
                verticalLineTo(17.27f)
                curveTo(2.75f, 19.83f, 3.17f, 20.25f, 5.78f, 20.25f)
                horizontalLineTo(15.22f)
                curveTo(17.8f, 20.25f, 18.22f, 19.85f, 18.25f, 17.42f)
                verticalLineTo(10.28f)
                curveTo(18.25f, 7.72f, 17.83f, 7.3f, 15.22f, 7.3f)
                horizontalLineTo(5.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 18.18f)
                curveTo(18.81f, 18.18f, 18.62f, 18.11f, 18.49f, 17.98f)
                curveTo(18.34f, 17.84f, 18.25f, 17.64f, 18.25f, 17.43f)
                verticalLineTo(10.28f)
                curveTo(18.25f, 7.72f, 17.83f, 7.3f, 15.22f, 7.3f)
                horizontalLineTo(5.78f)
                curveTo(5.51f, 7.3f, 5.26f, 7.31f, 5.03f, 7.32f)
                curveTo(4.83f, 7.33f, 4.63f, 7.25f, 4.48f, 7.11f)
                curveTo(4.33f, 6.97f, 4.25f, 6.77f, 4.25f, 6.56f)
                curveTo(4.29f, 3.3f, 5.39f, 2.25f, 8.78f, 2.25f)
                horizontalLineTo(18.22f)
                curveTo(21.65f, 2.25f, 22.75f, 3.34f, 22.75f, 6.73f)
                verticalLineTo(13.72f)
                curveTo(22.75f, 16.41f, 22.14f, 18f, 19.04f, 18.18f)
                curveTo(19.03f, 18.18f, 19.01f, 18.18f, 19f, 18.18f)
                close()
                moveTo(5.78f, 5.8f)
                horizontalLineTo(15.22f)
                curveTo(18.65f, 5.8f, 19.75f, 6.89f, 19.75f, 10.28f)
                verticalLineTo(16.6f)
                curveTo(20.91f, 16.39f, 21.25f, 15.79f, 21.25f, 13.72f)
                verticalLineTo(6.73f)
                curveTo(21.25f, 4.17f, 20.83f, 3.75f, 18.22f, 3.75f)
                horizontalLineTo(8.78f)
                curveTo(6.5f, 3.75f, 5.91f, 4.06f, 5.78f, 5.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.96f, 18.56f)
                horizontalLineTo(5.24f)
                curveTo(4.83f, 18.56f, 4.49f, 18.22f, 4.49f, 17.81f)
                curveTo(4.49f, 17.4f, 4.83f, 17.06f, 5.24f, 17.06f)
                horizontalLineTo(6.96f)
                curveTo(7.37f, 17.06f, 7.71f, 17.4f, 7.71f, 17.81f)
                curveTo(7.71f, 18.22f, 7.38f, 18.56f, 6.96f, 18.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.549f, 18.56f)
                horizontalLineTo(9.109f)
                curveTo(8.699f, 18.56f, 8.359f, 18.22f, 8.359f, 17.81f)
                curveTo(8.359f, 17.4f, 8.699f, 17.06f, 9.109f, 17.06f)
                horizontalLineTo(12.549f)
                curveTo(12.959f, 17.06f, 13.299f, 17.4f, 13.299f, 17.81f)
                curveTo(13.299f, 18.22f, 12.969f, 18.56f, 12.549f, 18.56f)
                close()
            }
        }.build()

        return _Cards!!
    }

@Suppress("ObjectPropertyName")
private var _Cards: ImageVector? = null
