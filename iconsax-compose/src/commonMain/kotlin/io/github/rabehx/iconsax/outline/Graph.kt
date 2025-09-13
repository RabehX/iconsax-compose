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

val Iconsax.Outline.Graph: ImageVector
    get() {
        if (_Graph != null) {
            return _Graph!!
        }
        _Graph = ImageVector.Builder(
            name = "Outline.Graph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.32f, 12.75f)
                horizontalLineTo(15f)
                curveTo(12.51f, 12.75f, 11.25f, 11.34f, 11.25f, 8.55f)
                verticalLineTo(5.68f)
                curveTo(11.25f, 4.66f, 11.37f, 3.2f, 12.43f, 2.4f)
                curveTo(13.32f, 1.74f, 14.6f, 1.69f, 16.49f, 2.24f)
                curveTo(18.97f, 2.96f, 21.04f, 5.03f, 21.76f, 7.51f)
                curveTo(22.31f, 9.39f, 22.26f, 10.68f, 21.6f, 11.56f)
                curveTo(20.8f, 12.63f, 19.34f, 12.75f, 18.32f, 12.75f)
                close()
                moveTo(14.28f, 3.36f)
                curveTo(13.87f, 3.36f, 13.55f, 3.44f, 13.34f, 3.6f)
                curveTo(12.95f, 3.89f, 12.76f, 4.57f, 12.76f, 5.68f)
                verticalLineTo(8.56f)
                curveTo(12.76f, 10.8f, 13.62f, 11.26f, 15.01f, 11.26f)
                horizontalLineTo(18.33f)
                curveTo(19.43f, 11.26f, 20.11f, 11.07f, 20.41f, 10.68f)
                curveTo(20.76f, 10.22f, 20.73f, 9.3f, 20.34f, 7.95f)
                curveTo(19.76f, 5.98f, 18.06f, 4.27f, 16.09f, 3.7f)
                curveTo(15.35f, 3.47f, 14.75f, 3.36f, 14.28f, 3.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.07f, 22.75f)
                curveTo(10.54f, 22.75f, 10f, 22.71f, 9.46f, 22.62f)
                curveTo(5.37f, 21.96f, 2.04f, 18.64f, 1.38f, 14.55f)
                curveTo(0.53f, 9.29f, 3.92f, 4.33f, 9.11f, 3.27f)
                curveTo(9.52f, 3.19f, 9.91f, 3.45f, 10f, 3.85f)
                curveTo(10.08f, 4.26f, 9.82f, 4.65f, 9.42f, 4.74f)
                curveTo(5.03f, 5.64f, 2.15f, 9.84f, 2.88f, 14.31f)
                curveTo(3.44f, 17.77f, 6.25f, 20.58f, 9.71f, 21.14f)
                curveTo(14.2f, 21.86f, 18.39f, 18.97f, 19.28f, 14.56f)
                curveTo(19.36f, 14.15f, 19.76f, 13.89f, 20.16f, 13.97f)
                curveTo(20.57f, 14.05f, 20.83f, 14.45f, 20.75f, 14.85f)
                curveTo(19.8f, 19.52f, 15.72f, 22.75f, 11.07f, 22.75f)
                close()
            }
        }.build()

        return _Graph!!
    }

@Suppress("ObjectPropertyName")
private var _Graph: ImageVector? = null
